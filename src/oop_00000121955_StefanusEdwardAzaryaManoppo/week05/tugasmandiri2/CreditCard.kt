package oop_00000121955_StefanusEdwardAzaryaManoppo.week05.tugasmandiri2

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Credit Card sukses. Total penggunaan: $usedAmount")
        } else {
            println("Transaksi ditolak: Melebihi limit.")
        }
    }
}