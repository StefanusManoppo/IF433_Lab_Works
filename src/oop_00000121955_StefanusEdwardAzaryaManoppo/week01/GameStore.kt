package oop_00000121955_StefanusEdwardAzaryaManoppo.week01

fun main() {
    val gameTitle = "Game"
    val price = 799000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println("--- SteamKW Receipt ---")
    println("Judul Game  : $gameTitle")
    println("Harga Asli  : Rp $price")
    println("Diskon      : Rp $discount")
    println("Harga Akhir : Rp $finalPrice")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.2).toInt() // Diskon 20%
} else {
    (price * 0.1).toInt() // Diskon 10%
}