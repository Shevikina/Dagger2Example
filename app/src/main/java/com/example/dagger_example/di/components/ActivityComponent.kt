package com.example.dagger_example.di.components

import com.example.dagger_example.MainActivity
import com.example.dagger_example.di.scopes.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface ActivityComponent {
    fun inject(activity: MainActivity)
}