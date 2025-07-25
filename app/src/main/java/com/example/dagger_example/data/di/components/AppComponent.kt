package com.example.dagger_example.data.di.components

import android.app.Application
import com.example.dagger_example.data.di.ExampleModule
import com.example.dagger_example.data.di.scopes.AppScope
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [ExampleModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance app:Application):AppComponent
    }
    fun activityComponent(): ActivityComponent
}