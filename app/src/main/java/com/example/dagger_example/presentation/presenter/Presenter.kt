package com.example.dagger_example.presentation.presenter

import android.app.Application
import javax.inject.Inject

class Presenter @Inject constructor(private val app: Application) : PresenterInterface