package com.example.idus.src.logIn

import android.animation.ObjectAnimator
import android.os.Bundle
import com.example.idus.R
import com.example.idus.config.BaseActivity
import com.example.idus.databinding.ActivityLoginBinding
import com.example.idus.databinding.ActivityMainBinding
import com.example.idus.databinding.ActivitySignUpBinding
import com.example.idus.src.main.`class`.ClassFragment
import com.example.idus.src.main.category.CategoryFragment
import com.example.idus.src.main.product.ProductFragment
import com.example.idus.src.main.profile.ProfileFragment
import com.example.idus.src.main.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class LoginActivity : BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.loginEtEmail.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus){
                if(binding.loginEtEmail.length() == 0) {
                    binding.loginTvEmail.alpha = 1f;
                    binding.loginTvEmail.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.loginTvEmail, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            }else{
                if(binding.loginEtEmail.length() == 0){
                    binding.loginTvEmail.alpha = 0.7f;
                    binding.loginTvEmail.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.loginTvEmail, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
        binding.loginEtPw.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                if (binding.loginEtPw.length() == 0) {
                    binding.loginTvPw.alpha = 1f;
                    binding.loginTvPw.textSize = 12f;
                    ObjectAnimator.ofFloat(binding.loginTvPw, "translationY", -50f).apply {
                        duration = 300
                        start()
                    }
                }
            } else {
                if (binding.loginEtPw.length() == 0) {
                    binding.loginTvPw.alpha = 0.7f;
                    binding.loginTvPw.textSize = 14f;
                    ObjectAnimator.ofFloat(binding.loginTvPw, "translationY", 8f).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
    }
}