package oop_00000121955_StefanusEdwardAzaryaManoppo.week10.tugasmandiri

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(keyword: String): List<T> {
        return items.filter {
            it.toString().contains(keyword, ignoreCase = true)
        }
    }
}