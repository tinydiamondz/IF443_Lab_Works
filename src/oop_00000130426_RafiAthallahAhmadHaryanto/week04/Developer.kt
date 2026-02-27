package oop_00000130426_RafiAthallahAhmadHaryanto.week04

class Developer (name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work() = println("$name sedang mengoding menggunakan $programmingLanguage")
    override fun calculateBonus() = baseSalary + super.calculateBonus()
}