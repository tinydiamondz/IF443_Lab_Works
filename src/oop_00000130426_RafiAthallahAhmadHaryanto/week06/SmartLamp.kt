package oop_00000130426_RafiAthallahAhmadHaryanto.week06

class SmartLamp (override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Lamp has been turned on")
    }
    override fun turnOff() {
        println("Lamp has been turned off")
    }
}