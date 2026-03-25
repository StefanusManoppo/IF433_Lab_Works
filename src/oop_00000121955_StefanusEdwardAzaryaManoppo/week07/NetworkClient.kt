package oop_00000121955_StefanusEdwardAzaryaManoppo.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}