package com.example.idus.src.signUp

import com.example.idus.config.ApplicationClass
import com.example.idus.src.signUp.model.PostSignUpReq
import com.example.idus.src.signUp.model.PostSignUpRes
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpEmailService(val signUpEmailActivityInterface : SignUpEmailActivityInterface) {

    fun tryPostSignUp(postSignUpRequest: PostSignUpReq){
        val signUpEmailRetrofitInterface = ApplicationClass.sRetrofit.create(SignUpEmailRetrofitInterface::class.java)
        signUpEmailRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object : Callback<PostSignUpRes> {
            override fun onResponse(call: Call<PostSignUpRes>, response: Response<PostSignUpRes>) {
                signUpEmailActivityInterface.onPostSignUpSuccess(response.body() as PostSignUpRes)
            }

            override fun onFailure(call: Call<PostSignUpRes>, t: Throwable) {
                signUpEmailActivityInterface.onPostSignUpFailure(t.message ?: "통신 오류")
            }
        })
    }

}