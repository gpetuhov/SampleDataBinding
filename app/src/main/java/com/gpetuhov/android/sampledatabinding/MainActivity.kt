package com.gpetuhov.android.sampledatabinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gpetuhov.android.sampledatabinding.databinding.ActivityMainBinding
import com.gpetuhov.android.sampledatabinding.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set content view and get the binding
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Bind the user to the UI
        binding.user = User("Bob")
    }
}
