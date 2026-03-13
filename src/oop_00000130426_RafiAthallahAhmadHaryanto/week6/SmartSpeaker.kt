package oop_00000130426_RafiAthallahAhmadHaryanto.week6

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker has been turned on.")
    }
    override fun turnOff() {
        println("Speaker has been turned off.")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}