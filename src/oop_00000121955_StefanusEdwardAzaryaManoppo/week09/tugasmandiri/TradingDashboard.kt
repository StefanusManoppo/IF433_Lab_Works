package oop_00000121955_StefanusEdwardAzaryaManoppo.week09.tugasmandiri

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 12.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, -18.5, "CLOSED"),
        TradeLog("DOGEUSDT", "LONG", 10, 45.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, -3.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}