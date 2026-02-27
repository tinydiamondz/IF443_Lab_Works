package oop_00000130426_RafiAthallahAhmadHaryanto.week04

fun main() {
    val Manager = Manager("Rap", 10000000)
    val Developer = Developer("Keii", 10000000, "Kotlin")

    // Manager
    Manager.work()
    println("Salary: Rp ${Manager.calculateBonus()}")

    // Developer
    Developer.work()
    println("Salary: Rp ${Developer.calculateBonus()}")
}