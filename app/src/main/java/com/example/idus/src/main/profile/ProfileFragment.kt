package com.example.idus.src.main.profile

import android.os.Bundle
import android.view.View
import com.example.idus.R
import com.example.idus.config.BaseFragment
import com.example.idus.databinding.FragmentProductBinding

class ProfileFragment : BaseFragment<FragmentProductBinding>(FragmentProductBinding::bind,
    R.layout.fragment_profile){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}