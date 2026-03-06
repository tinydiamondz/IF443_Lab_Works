package oop_00000130426_RafiAthallahAhmadHaryanto.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}