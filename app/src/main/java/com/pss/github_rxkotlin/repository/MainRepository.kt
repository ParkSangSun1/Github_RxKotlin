package com.pss.github_rxkotlin.repository

import com.pss.github_rxkotlin.data.remote.api.GithubApi
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val githubApi: GithubApi
){
    fun getUserInfo(owner : String) = githubApi.getRepos(owner)
}