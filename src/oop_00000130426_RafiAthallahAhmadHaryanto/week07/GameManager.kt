package oop_00000130426_RafiAthallahAhmadHaryanto.week07

object GameManager {
    var isGameRunning: Boolean = false
    fun startGame() {
        when(isGameRunning) {
            true -> { println("Game sudah berjalan!") }
            false -> {
                isGameRunning = true
                println("Memulai Game Engine...")
            }
        }
    }
}