package oop_00000121955_StefanusEdwardAzaryaManoppo.week04.tugasmandiri2

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return baseSalary * 10 / 100
    }
}