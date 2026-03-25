package oop_00000121955_StefanusEdwardAzaryaManoppo.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}