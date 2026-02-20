package oop_00000130426_RafiAthallahAhmadHaryanto.week03

fun main() {
    val e = Employee("Rafi")

    // 1. Test Validasi Salary
    e.salary = -1000    // harusnya print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapculation
    e.increasePerformance()
    // e.performanceRating = 5 // Coba uncomment, pasti Merah (Error)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}