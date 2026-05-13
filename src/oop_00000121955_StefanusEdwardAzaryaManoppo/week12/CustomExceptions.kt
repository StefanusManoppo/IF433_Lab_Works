package oop_00000121955_StefanusEdwardAzaryaManoppo.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")