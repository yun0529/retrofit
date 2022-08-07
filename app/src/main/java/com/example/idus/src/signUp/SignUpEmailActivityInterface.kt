package com.example.idus.src.signUp

import com.example.idus.src.signUp.model.PostSignUpRes

interface SignUpEmailActivityInterface {

    fun onPostSignUpSuccess(response: PostSignUpRes)

    fun onPostSignUpFailure(message: String)
}