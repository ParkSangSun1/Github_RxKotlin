package com.pss.github_rxkotlin.view

import androidx.activity.viewModels
import com.pss.github_rxkotlin.R
import com.pss.github_rxkotlin.base.BaseActivity
import com.pss.github_rxkotlin.databinding.ActivityMainBinding
import com.pss.github_rxkotlin.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val mainViewModel by viewModels<MainViewModel>()


    override fun init() {

    }
}