package oop_00000130426_RafiAthallahAhmadHaryanto.week02

import java.util.Scanner

class Hero (val name: String, var hp: Int = 100, val baseDamage: Int){
    fun attack(targetName: String) {
        println("$name menebas $targetName dengan damage: $baseDamage")
    }
    fun takeDamage(damage: Int) {
        hp -= damage
        if(hp < 0) hp = 0
    }
    fun isAlive(): Boolean = if(hp > 0) return true else false
}
