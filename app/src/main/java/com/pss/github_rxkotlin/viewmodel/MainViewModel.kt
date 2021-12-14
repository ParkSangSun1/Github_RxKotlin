package com.pss.github_rxkotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.pss.github_rxkotlin.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

}