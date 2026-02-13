package oop_00000130426_RafiAthallahAhmadHaryanto.week02

import java.util.Scanner

class Loan (val bookTitle: String, val borrowed: String, val loanDuration: Int = 1){
    val denda = calculationFine(loanDuration)
    fun calculationFine(loanDuration: Int): Int = if(loanDuration > 3) return (loanDuration - 3) * 2000 else return 0
}

