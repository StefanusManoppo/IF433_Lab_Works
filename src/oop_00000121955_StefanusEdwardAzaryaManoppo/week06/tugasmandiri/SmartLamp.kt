package oop_00000121955_StefanusEdwardAzaryaManoppo.week06.tugasmandiri

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu '$name' dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu '$name' dimatikan.")
    }
}