package com.viktor_zet.beatbox_p5

private const val WAV = ".wav"

class Sound(val assepPath: String) {
    val name= assepPath.split("/").last().removeSuffix(WAV)

}