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
}