package com.pss.github_rxkotlin.di

import com.pss.github_rxkotlin.data.remote.api.GithubApi
import com.pss.github_rxkotlin.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMainRepository(
        githubApi: GithubApi
    ) = MainRepository(githubApi)
}