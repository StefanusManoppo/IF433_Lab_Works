package oop_00000121955_StefanusEdwardAzaryaManoppo.week02.tugasmandiri2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("MINI RPG BATTLE")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    val myHero = Hero(name, baseDamage)

    var enemyHp = 100
    println("\nMusuh muncul dengan HP: $enemyHp")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\nGILIRAN MU")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            myHero.attack("Monster")
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("Musuh terkena ${myHero.baseDamage} damage. Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val damageToHero = (10..20).random()
                println("Musuh membalas menyerang! ($damageToHero damage)")
                myHero.takeDamage(damageToHero)
                println("Sisa HP ${myHero.name}: ${myHero.hp}")
            }

        } else if (choice == 2) {
            println("${myHero.name} memilih untuk kabur...")
            break
        }
    }

    println("\nGAME OVER")

    if (enemyHp <= 0) {
        println("SELAMAT! Musuh telah kalah. ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("${myHero.name} telah gugur.")
    } else {
        println("Pertarungan dihentikan karena kabur.")
    }
}