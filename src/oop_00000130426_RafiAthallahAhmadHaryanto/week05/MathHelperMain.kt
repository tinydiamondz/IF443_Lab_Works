package oop_00000130426_RafiAthallahAhmadHaryanto.week05

fun main() {
    val Mh = MathHelper()
    println("Luas persegi dengan sisi 3cm adalah: ${Mh.hitungLuas(3)}cm²")
    println("Luas persegi panjang dengan panjang 3cm dan lebar 5cm adalah: ${Mh.hitungLuas(3, 5)}cm²")
    println("Luas lingkaran dengan radius 7.5cm adalah: ${String.format("%.1f", Mh.hitungLuas(7.5))}cm²")
}