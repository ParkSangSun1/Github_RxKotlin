package com.pss.github_rxkotlin.data.remote.api

import com.pss.github_rxkotlin.data.remote.model.GithubResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {
    @GET("users/{owner}/repos")
    fun getRepos(@Path("owner") owner: String) : Single<List<GithubResponse>>
}