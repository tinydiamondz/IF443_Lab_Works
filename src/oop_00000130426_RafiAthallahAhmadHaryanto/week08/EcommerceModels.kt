package oop_00000130426_RafiAthallahAhmadHaryanto.week08

// Sealed class sebagai parent
sealed class Product {
    abstract val id: String
    abstract val name: String
}

// Turunan Electronic
data class Electronic(
    override val id: String,
    override val name: String,
    val warrantyMonths: Int
) : Product()

// Turunan Clothing
data class Clothing(
    override val id: String,
    override val name: String,
    val size: String
) : Product()