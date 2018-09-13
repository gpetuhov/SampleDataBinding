package com.gpetuhov.android.sampledatabinding.handlers

import android.util.Log
import android.view.View
import com.gpetuhov.android.sampledatabinding.model.User
import org.jetbrains.anko.toast

class Handlers {

    fun onButtonClick(view: View) {
        Log.d("Handlers", "Button click")
        view.context.toast("Hello, world!")
    }

    // Long click listener must return boolean!
    fun onButtonLongClick(view: View, user: User): Boolean {
        view.context.toast("Hello, ${user.name}!")
        return true
    }
}