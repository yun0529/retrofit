package com.example.idus.src.main

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

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().replace(R.id.main_fl, ProductFragment()).commitAllowingStateLoss()

        binding.mainBtn.setOnNavigationItemSelectedListener(
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.menu_main_btn_product -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fl, ProductFragment())
                            .commitAllowingStateLoss()
//                        item.setIcon(R.drawable.ic_home_filled)
//                        binding.mainBn.menu.findItem(R.id.menu_main_btm_nav_community).setIcon(R.drawable.ic_community_empty)
//                        binding.mainBn.menu.findItem(R.id.menu_main_btm_nav_near_me).setIcon(R.drawable.ic_near_me_empty)
//                        binding.mainBn.menu.findItem(R.id.menu_main_btm_nav_chatting).setIcon(R.drawable.icon_chatting_empty)
//                        binding.mainBn.menu.findItem(R.id.menu_main_btm_nav_mypage).setIcon(R.drawable.ic_mypage_empty)
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.menu_main_btn_class -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fl, ClassFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.menu_main_btn_search -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fl, SearchFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.menu_main_btn_category -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fl, CategoryFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.menu_main_btn_profile -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_fl, ProfileFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            })

    }
}