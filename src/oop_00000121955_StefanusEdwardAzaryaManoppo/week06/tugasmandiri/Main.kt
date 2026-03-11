package oop_00000121955_StefanusEdwardAzaryaManoppo.week06.tugasmandiri

fun main() {
    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val speakerDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lampuTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}