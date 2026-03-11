package oop_00000121955_StefanusEdwardAzaryaManoppo.week06

class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}