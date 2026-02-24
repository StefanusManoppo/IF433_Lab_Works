package oop_00000121955_StefanusEdwardAzaryaManoppo.week03.tugasmandiri1

fun main() {
    val pedang = Weapon("Pedang Naga")

    println("Test 1: Set Damage Negatif")
    pedang.damage = -50
    println("Damage saat ini: ${pedang.damage}")

    println("\nTest 2: Set Damage Overpowered")
    pedang.damage = 9999
    println("Damage saat ini: ${pedang.damage}")

    println("\nTest 3: Print Tier")
    println("Senjata: ${pedang.name}")
    println("Tier: ${pedang.tier}")
}