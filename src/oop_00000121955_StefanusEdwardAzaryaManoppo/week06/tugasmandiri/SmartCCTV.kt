package oop_00000121955_StefanusEdwardAzaryaManoppo.week06.tugasmandiri

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam video pengawasan.")
    }
}