package com.example.idus.src.signUp

import android.os.Bundle
import com.example.idus.R
import com.example.idus.config.BaseActivity
import com.example.idus.databinding.ActivityMainBinding
import com.example.idus.databinding.ActivitySignUpBinding
import com.example.idus.src.main.`class`.ClassFragment
import com.example.idus.src.main.category.CategoryFragment
import com.example.idus.src.main.product.ProductFragment
import com.example.idus.src.main.profile.ProfileFragment
import com.example.idus.src.main.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(ActivitySignUpBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}