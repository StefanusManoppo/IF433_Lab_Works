package oop_00000121955_StefanusEdwardAzaryaManoppo.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // KODE DI BAWAH INI SALAH & BERBAHAYA
            this.salary = value
        }
}