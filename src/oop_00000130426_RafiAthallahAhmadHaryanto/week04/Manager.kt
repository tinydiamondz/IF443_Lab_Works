package oop_00000130426_RafiAthallahAhmadHaryanto.week04

class Manager (name: String, baseSalary: Int): Employee(name, baseSalary){
    override fun work() = println("$name sedang memimpin rapat divisi.")
    override fun calculateBonus(): Int = return baseSalary + super.calculateBonus() + 500000
}