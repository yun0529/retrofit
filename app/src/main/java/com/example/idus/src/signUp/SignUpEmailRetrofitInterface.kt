package com.example.idus.src.signUp

import com.example.idus.src.signUp.model.PostSignUpReq
import com.example.idus.src.signUp.model.PostSignUpRes
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface SignUpEmailRetrofitInterface {
    @POST("/users")
    fun postSignUp(@Body params: PostSignUpReq): Call<PostSignUpRes>
}