package com.example.dagger_example.di.modules

import com.example.dagger_example.presentation.presenter.PresenterInterface
import com.example.dagger_example.presentation.presenter.Presenter
import dagger.Binds
import dagger.Module

@Module
interface ExampleModule {

    @Binds
    fun presenter(impl: Presenter): PresenterInterface
}