package com.example.idus.src.splash

import android.os.Bundle
import com.example.idus.R
import com.example.idus.config.BaseActivity
import com.example.idus.databinding.ActivityMainBinding
import com.example.idus.src.main.`class`.ClassFragment
import com.example.idus.src.main.category.CategoryFragment
import com.example.idus.src.main.product.ProductFragment
import com.example.idus.src.main.profile.ProfileFragment
import com.example.idus.src.main.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class SplashActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}