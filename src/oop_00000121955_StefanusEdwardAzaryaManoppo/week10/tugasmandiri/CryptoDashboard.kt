package oop_00000121955_StefanusEdwardAzaryaManoppo.week10.tugasmandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 2000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status API: ${response.status}")
    println("--- Data Koin ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name}, Saldo: ${coin.balance}")
    }

    println("\n--- Data Transaksi ---")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-1001", 0.15))
    txRepo.add(Transaction("TX-1002", 5.0))

    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}, Jumlah: ${tx.amount}")
    }

}