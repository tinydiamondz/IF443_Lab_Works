package oop_00000130426_RafiAthallahAhmadHaryanto.week6

interface Clickable {
    val name: String // Abstract property, tidak ada nilai default
    fun click()
}

class button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}