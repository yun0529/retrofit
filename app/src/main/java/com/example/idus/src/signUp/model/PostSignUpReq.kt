package com.example.idus.src.signUp.model

import com.google.gson.annotations.SerializedName

data class PostSignUpReq(
    @SerializedName("userEmail") val userEmail: String,
    @SerializedName("userName") val userName: String,
    @SerializedName("userPw") val userPw: String,
    @SerializedName("userPhoneNumber") val userPhoneNumber: String
)
