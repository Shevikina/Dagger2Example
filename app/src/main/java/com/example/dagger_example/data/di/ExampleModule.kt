package com.example.dagger_example.data.di

import com.example.dagger_example.domain.di.PresenterInterface
import com.example.dagger_example.ui.presenter.Presenter
import dagger.Binds
import dagger.Module

@Module
interface ExampleModule {

    @Binds
    fun presenter(impl: Presenter): PresenterInterface
}