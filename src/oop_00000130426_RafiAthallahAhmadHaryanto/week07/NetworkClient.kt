package oop_00000130426_RafiAthallahAhmadHaryanto.week07

class NetworkClient private constructor(val url: String){
    fun connect() {
        println("Connecting to $url...")
    }
}