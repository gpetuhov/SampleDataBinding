package com.gpetuhov.android.sampledatabinding.handlers

import android.util.Log
import android.view.View
import org.jetbrains.anko.toast

class Handlers {
    fun onButtonClick(view: View) {
        Log.d("Handlers", "Button click")
        view.context.toast("Hello, world!")
    }
}