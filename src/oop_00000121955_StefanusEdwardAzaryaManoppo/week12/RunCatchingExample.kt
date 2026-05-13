package oop_00000121955_StefanusEdwardAzaryaManoppo.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}