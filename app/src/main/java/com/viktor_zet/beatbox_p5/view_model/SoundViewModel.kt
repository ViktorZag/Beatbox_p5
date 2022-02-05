package com.viktor_zet.beatbox_p5.view_model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.viktor_zet.beatbox_p5.BeatBox
import com.viktor_zet.beatbox_p5.model.Sound

class SoundViewModel(private val beatBox: BeatBox) : BaseObservable() {
    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }

    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }

    @get:Bindable
    val title: String?
        get() = sound?.name
}