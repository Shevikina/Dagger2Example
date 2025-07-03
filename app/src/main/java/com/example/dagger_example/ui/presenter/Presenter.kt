package com.example.dagger_example.ui.presenter

import android.app.Application
import com.example.dagger_example.domain.di.PresenterInterface
import javax.inject.Inject

class Presenter @Inject constructor(private val app: Application) : PresenterInterface