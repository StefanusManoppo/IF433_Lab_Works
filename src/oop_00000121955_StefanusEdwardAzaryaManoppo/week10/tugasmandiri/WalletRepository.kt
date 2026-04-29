package oop_00000121955_StefanusEdwardAzaryaManoppo.week10.tugasmandiri

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}