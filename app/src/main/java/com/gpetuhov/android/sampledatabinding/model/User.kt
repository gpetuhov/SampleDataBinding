package com.gpetuhov.android.sampledatabinding.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.gpetuhov.android.sampledatabinding.BR

// Data class can be made observable like this:
class User(name: String, isProgrammer: Boolean) : BaseObservable() {

    @get:Bindable
    var name = name
        set(value) {
            field = value
            // In the setter we must call notifyPropertyChanged.
            // BR is a generated class
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var isProgrammer = isProgrammer
        set(value) {
            field = value
            notifyPropertyChanged(BR.programmer)
        }
}