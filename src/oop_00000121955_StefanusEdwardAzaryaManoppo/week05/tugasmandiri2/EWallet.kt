package oop_00000121955_StefanusEdwardAzaryaManoppo.week05.tugasmandiri2

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran EWallet sukses. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up EWallet sukses. Saldo sekarang: $balance")
    }
}