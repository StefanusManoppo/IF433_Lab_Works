package oop_00000121955_StefanusEdwardAzaryaManoppo.week05.tugasmandiri2

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}