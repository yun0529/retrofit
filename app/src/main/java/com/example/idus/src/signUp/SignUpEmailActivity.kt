package com.example.idus.src.signUp

import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import android.view.animation.TranslateAnimation
import com.example.idus.R
import com.example.idus.config.ApplicationClass.Companion.USER_IDX
import com.example.idus.config.ApplicationClass.Companion.X_ACCESS_TOKEN
import com.example.idus.config.ApplicationClass.Companion.editor
import com.example.idus.config.BaseActivity
import com.example.idus.databinding.ActivityMainBinding
import com.example.idus.databinding.ActivitySignUpBinding
import com.example.idus.databinding.ActivitySignUpEmailBinding
import com.example.idus.src.main.`class`.ClassFragment
import com.example.idus.src.main.category.CategoryFragment
import com.example.idus.src.main.product.ProductFragment
import com.example.idus.src.main.profile.ProfileFragment
import com.example.idus.src.main.search.SearchFragment
import com.example.idus.src.signUp.model.PostSignUpReq
import com.example.idus.src.signUp.model.PostSignUpRes
import com.google.android.material.bottomnavigation.BottomNavigationView

class SignUpEmailActivity : BaseActivity<ActivitySignUpEmailBinding>(ActivitySignUpEmailBinding::inflate),
    SignUpEmailActivityInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.suEmailEtEmail.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus){
                if(binding.suEmailEtEmail.length() == 0) {
                    binding.suEmailTvEmail.alpha = 1f;
                    binding.suEmailTvEmail.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.suEmailTvEmail, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            }else{
                if(binding.suEmailEtEmail.length() == 0){
                    binding.suEmailTvEmail.alpha = 0.7f;
                    binding.suEmailTvEmail.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.suEmailTvEmail, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
        binding.suEmailEtName.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                if (binding.suEmailEtName.length() == 0) {
                    binding.suEmailTvName.alpha = 1f;
                    binding.suEmailTvName.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.suEmailTvName, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            } else {
                if (binding.suEmailEtName.length() == 0) {
                    binding.suEmailTvName.alpha = 0.7f;
                    binding.suEmailTvName.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.suEmailTvName, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
        binding.suEmailEtPhone.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                if (binding.suEmailEtPhone.length() == 0) {
                    binding.suEmailTvPhone.alpha = 1f;
                    binding.suEmailTvPhone.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPhone, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            } else {
                if (binding.suEmailEtPhone.length() == 0) {
                    binding.suEmailTvPhone.alpha = 0.7f;
                    binding.suEmailTvPhone.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPhone, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
        binding.suEmailEtPw.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                if (binding.suEmailEtPw.length() == 0) {
                    binding.suEmailTvPw.alpha = 1f;
                    binding.suEmailTvPw.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPw, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            } else {
                if (binding.suEmailEtPw.length() == 0) {
                    binding.suEmailTvPw.alpha = 0.7f;
                    binding.suEmailTvPw.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPw, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
        binding.suEmailEtPwConf.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                if (binding.suEmailEtPwConf.length() == 0) {
                    binding.suEmailTvPwConf.alpha = 1f;
                    binding.suEmailTvPwConf.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPwConf, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            } else {
                if (binding.suEmailEtPwConf.length() == 0) {
                    binding.suEmailTvPwConf.alpha = 0.7f;
                    binding.suEmailTvPwConf.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPwConf, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
        binding.suEmailEtPhone.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                if (binding.suEmailEtPhone.length() == 0) {
                    binding.suEmailTvPhone.alpha = 1f;
                    binding.suEmailTvPhone.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPhone, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            } else {
                if (binding.suEmailEtPhone.length() == 0) {
                    binding.suEmailTvPhone.alpha = 0.7f;
                    binding.suEmailTvPhone.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.suEmailTvPhone, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
        binding.suEmailEtCode.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                if (binding.suEmailEtCode.length() == 0) {
                    binding.suEmailTvCode.alpha = 1f;
                    binding.suEmailTvCode.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.suEmailTvCode, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            } else {
                if (binding.suEmailEtCode.length() == 0) {
                    binding.suEmailTvCode.alpha = 0.7f;
                    binding.suEmailTvCode.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.suEmailTvCode, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }

        binding.suEmailBtSignUp.setOnClickListener {
            var userEmail = binding.suEmailEtEmail.text.toString()
            var userName = binding.suEmailEtName.text.toString()
            var userPw = binding.suEmailEtPw.text.toString()
            var userPwConf = binding.suEmailEtPwConf.text.toString()
            var userPhoneNumber = binding.suEmailEtPhone.text.toString()
            var userCode = binding.suEmailEtCode.text.toString()
            if(userPw != userPwConf){
                showCustomToast("비밀번호가 일치하지 않습니다.")
            }else{
                val postRequest = PostSignUpReq(userEmail = userEmail, userName = userName,userPw = userPw,
                    userPhoneNumber = userPhoneNumber)
                showLoadingDialog(this)
                SignUpEmailService(this).tryPostSignUp(postRequest)
            }

        }

    }
    override fun onPostSignUpSuccess(response: PostSignUpRes) {
        dismissLoadingDialog()
        when (response.message) {
            "요청에 성공하였습니다." -> {
                showCustomToast("회원가입 성공")
                editor.putString(X_ACCESS_TOKEN, response.result.jwt.toString())
                editor.putInt(USER_IDX, response.result.userIdx)
                editor.commit()
            }
            else -> {
                showCustomToast(response.message.toString())
            }
        }
    }

    override fun onPostSignUpFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }
}