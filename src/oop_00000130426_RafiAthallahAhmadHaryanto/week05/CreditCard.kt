package oop_00000130426_RafiAthallahAhmadHaryanto.week05

class CreditCard (accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        if((usedAmount + amount) < limit) {
            usedAmount += amount
            println("Amount: Rp$amount\nUsed Amount: Rp$usedAmount\nLimit: Rp$limit")
        }
        else println("Transaction Failed")
    }
}