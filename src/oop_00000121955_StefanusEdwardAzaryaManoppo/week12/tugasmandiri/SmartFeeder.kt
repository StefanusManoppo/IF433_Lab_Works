package oop_00000121955_StefanusEdwardAzaryaManoppo.week12.tugasmandiri

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("[JADWAL 1] Memulai jadwal makan pagi...")
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("[WARNING] Hardware: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("[WARNING] Stok: ${e.message}")
    } catch (e: Exception) {
        println("[ERROR] Sistem: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
}