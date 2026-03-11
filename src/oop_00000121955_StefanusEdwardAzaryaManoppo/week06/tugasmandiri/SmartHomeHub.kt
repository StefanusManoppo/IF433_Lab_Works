package oop_00000121955_StefanusEdwardAzaryaManoppo.week06.tugasmandiri

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("Mematikan semua perangkat Switchable")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}