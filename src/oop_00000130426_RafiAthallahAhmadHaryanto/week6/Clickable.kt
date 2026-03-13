package oop_00000130426_RafiAthallahAhmadHaryanto.week6

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    //Function without boddy (Implicitly Abstract)
    fun click()
}