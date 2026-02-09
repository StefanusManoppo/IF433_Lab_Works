package oop_00000121955_StefanusEdwardAzaryaManoppo.week01

fun main() {
    val gameTitle = "Game"
    val price = 799000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    val userNote: String? = null

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice, userNote = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.2).toInt() // Diskon 20%
} else {
    (price * 0.1).toInt() // Diskon 10%
}

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, userNote: String?) {
    println("--- SteamKW Receipt ---")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : ${userNote ?: "Tidak ada catatan"}")
}