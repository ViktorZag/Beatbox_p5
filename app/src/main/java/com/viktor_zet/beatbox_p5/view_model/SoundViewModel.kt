package com.viktor_zet.beatbox_p5.view_model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.viktor_zet.beatbox_p5.model.Sound

class SoundViewModel : BaseObservable() {

    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }

    @get:Bindable
    val title: String?
        get() = sound?.name
}