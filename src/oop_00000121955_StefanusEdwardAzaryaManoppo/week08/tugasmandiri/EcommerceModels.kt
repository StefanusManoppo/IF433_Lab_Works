package oop_00000121955_StefanusEdwardAzaryaManoppo.week08.tugasmandiri

sealed class Product

data class Electronic(
    val id: String,
    val name: String,
    val warrantyMonths: Int
) : Product()

data class Clothing(
    val id: String,
    val name: String,
    val size: String
) : Product()