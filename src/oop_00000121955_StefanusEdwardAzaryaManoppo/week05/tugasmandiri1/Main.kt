package oop_00000121955_StefanusEdwardAzaryaManoppo.week05.tugasmandiri1

fun main() {
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas Persegi (sisi 5) = $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(10, 4)
    println("Luas Persegi Panjang (10 x 4) = $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(10.0)
    println("Luas Lingkaran (jari-jari 10.0) = $luasLingkaran")
}