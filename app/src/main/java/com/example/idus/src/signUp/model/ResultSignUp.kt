package com.example.idus.src.signUp.model

import com.google.gson.annotations.SerializedName

data class ResultSignUp(
    @SerializedName("userIdx") val userIdx: Int,
    @SerializedName("jwt") val jwt: String
)
