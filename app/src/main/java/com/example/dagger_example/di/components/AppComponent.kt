package com.example.dagger_example.di.components

import android.app.Application
import com.example.dagger_example.di.scopes.AppScope
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }

    fun activityComponent(): ActivityComponent
}