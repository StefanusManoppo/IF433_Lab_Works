package oop_00000121955_StefanusEdwardAzaryaManoppo.week05.tugasmandiri2

fun main() {
    val dompetDigital = EWallet("UserA", 50000.0)
    val kartuKredit = CreditCard("UserB", 100000.0)

    val listPembayaran: List<PaymentMethod> = listOf(dompetDigital, kartuKredit)

    for (metode in listPembayaran) {
        println("Memproses pembayaran untuk: ${metode.accountName}")
        metode.processPayment(75000.0)
    }
}