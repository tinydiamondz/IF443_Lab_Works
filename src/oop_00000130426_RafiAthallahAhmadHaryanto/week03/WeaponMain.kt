package oop_00000130426_RafiAthallahAhmadHaryanto.week03

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input Weapon: ")
    val w = Weapon(scanner.nextLine())

    print("Input Damage: ")
    w.damage = scanner.nextInt()

    w.printStat()
}