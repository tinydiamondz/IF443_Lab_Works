package oop_00000130426_RafiAthallahAhmadHaryanto.week03

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var whileFlag = true

    print("Input Username: ")
    val p = Player(scanner.nextLine())

    while(true) {
        print("Input XP: ")
        p.addXp(scanner.nextInt())
        scanner.nextLine() //clear buffer

        print("\nInput xp again (y/N): ")
        var choose: String= scanner.nextLine()
        if(choose.lowercase() != "y") {
            break
        }
    }
}