package oop_00000121955_StefanusEdwardAzaryaManoppo.week07.tugasmandiri

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println()

    val legendaryDropChance = ItemRarity.LEGENDARY.dropChance
    println("Drop chance item Legendary: $legendaryDropChance%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Mendapatkan senjata awal:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    println()

    println("Pergi ke Blacksmith untuk upgrade senjata...")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Senjata di-upgrade! Damage baru: ${upgradedItem.damage}")
    println()

    println("=== Memulai Simulasi Event ===")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}