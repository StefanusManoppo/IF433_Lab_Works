package oop_00000121955_StefanusEdwardAzaryaManoppo.week04.tugasmandiri2

fun main() {
    println("\n[ Profil Manager ]")
    val manager = Manager("Joy", 12000000)
    manager.work()
    println("Bonus: Rp ${manager.calculateBonus()}")

    println("\n[ Profil Developer ]")
    val developer = Developer("Jogpreet", 8500000, "Kotlin")
    developer.work()
    println("Bonus: Rp ${developer.calculateBonus()}")
}