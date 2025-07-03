package com.example.dagger_example

import android.app.Application
import com.example.dagger_example.data.di.components.AppComponent
import com.example.dagger_example.data.di.components.DaggerAppComponent

class ExampleApp: Application() {
    val appComponent: AppComponent = DaggerAppComponent.factory().create(this)
}