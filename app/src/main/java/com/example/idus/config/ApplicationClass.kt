package com.example.idus.config

import android.app.Application
import android.content.SharedPreferences
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit

class ApplicationClass : Application() {
    val API_URL = "https://prod.idus-b.shop/"

    val ADDRESS_API_URL = "https://dapi.kakao.com/"

    // 테스트 서버 주소
    // val API_URL = "http://prod.carrot-market.site:9000/products"

    // 실 서버 주소
    // val API_URL = "https://prod.carrot-market.site/"

    companion object {
        // 만들어져있는 SharedPreferences 를 사용
        lateinit var sSharedPreferences: SharedPreferences
        lateinit var editor : SharedPreferences.Editor
        val X_ACCESS_TOKEN = "X-ACCESS-TOKEN"
        val USER_IDX = "USER_IDX"
        val USER_ADDRESS = "USER_ADDRESS"
        val INTEREST_STATUS = "INTEREST_STATUS"
        val ADDRESS_KEY = "77bf0c5c048b5b248605af87fc714045"

        lateinit var sRetrofit: Retrofit

        lateinit var aRetrofit: Retrofit

    }
    override fun onCreate() {
        super.onCreate()
        sSharedPreferences =
            applicationContext.getSharedPreferences("USER_TOKEN", MODE_PRIVATE)
        editor = sSharedPreferences.edit()
        // 레트로핏 인스턴스 생성
        initRetrofitInstance()
    }

    private fun initRetrofitInstance() {
        val client: OkHttpClient = OkHttpClient.Builder()
            .readTimeout(5000, TimeUnit.MILLISECONDS)
            .connectTimeout(5000, TimeUnit.MILLISECONDS)
            // 로그캣에 okhttp.OkHttpClient로 검색하면 http 통신 내용을 보여줍니다.
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .addNetworkInterceptor(XAccessTokenInterceptor()) // JWT 자동 헤더 전송
            .build()

        val client2: OkHttpClient = OkHttpClient.Builder()
            .readTimeout(5000, TimeUnit.MILLISECONDS)
            .connectTimeout(5000, TimeUnit.MILLISECONDS)
            // 로그캣에 okhttp.OkHttpClient로 검색하면 http 통신 내용을 보여줍니다.
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .addNetworkInterceptor(KakaoAccessInterceptor())
            .build()

        // sRetrofit 이라는 전역변수에 API url, 인터셉터, Gson을 넣어주고 빌드해주는 코드
        // 이 전역변수로 http 요청을 서버로 보내면 됩니다.
        sRetrofit = Retrofit.Builder()
            .baseUrl(API_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        aRetrofit = Retrofit.Builder()
            .baseUrl(ADDRESS_API_URL)
            .client(client2)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun provideOkHttpClient(
        interceptor: AppInterceptor
    ): OkHttpClient = OkHttpClient.Builder()
        .run {
            addInterceptor(interceptor)
            build()
        }

    class AppInterceptor : Interceptor {
        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain)
                : Response = with(chain) {
            val newRequest = request().newBuilder()
                .addHeader("Authorization", "KakaoAK " + ADDRESS_KEY)
                .build()

            proceed(newRequest)
        }
    }
}