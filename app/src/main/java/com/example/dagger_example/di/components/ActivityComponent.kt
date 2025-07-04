package com.example.dagger_example.di.components

import com.example.dagger_example.MainActivity
import com.example.dagger_example.di.modules.ExampleModule
import com.example.dagger_example.di.scopes.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ExampleModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
}