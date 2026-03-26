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
}