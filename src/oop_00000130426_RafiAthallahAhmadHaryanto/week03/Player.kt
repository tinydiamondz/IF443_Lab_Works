package oop_00000130426_RafiAthallahAhmadHaryanto.week03

import java.util.Scanner

class Player(val username: String) {
    private var xp: Int = 0
    var level: Int = 0
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if(amount < 0) {
            println("Hanya menerima angka positif")
            return
        }

        var levelBefore = level
        xp += amount
        var levelAfter = level

        printStat(levelAfter, levelBefore)
    }

    fun printStat(levelAfter: Int, levelBefore: Int) {
        println("\n=== PLAYER STATUS ===")
        if(levelAfter > levelBefore) println("Level Up! Selamat $username naik ke level $level")
        println("Username   : $username")
        println("XP         : $xp")
        println("Level      : $level")
    }
}

