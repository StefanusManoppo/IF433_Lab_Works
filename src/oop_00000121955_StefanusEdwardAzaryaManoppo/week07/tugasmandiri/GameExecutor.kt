package oop_00000121955_StefanusEdwardAzaryaManoppo.week07.tugasmandiri

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Peringatan: Kamu dihadang oleh monster ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            println("Selamat! Kamu menemukan barang rampasan berupa ${event.item.name} dengan tingkat kelangkaan ${event.item.rarity}.")
        }
        is BattleState.GameOver -> {
            println("Permainan Berakhir. Penyebab: ${event.reason}.")
        }
        BattleState.SafeZone -> {
            println("Kamu telah memasuki zona aman. Silakan beristirahat dan memulihkan tenaga.")
        }
    }
}