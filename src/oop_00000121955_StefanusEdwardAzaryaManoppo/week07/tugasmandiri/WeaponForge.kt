package oop_00000121955_StefanusEdwardAzaryaManoppo.week07.tugasmandiri

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Pedang All-Black the Necrosword", 120, ItemRarity.EPIC)
            return Weapon(epicItem, 1000)
        }
    }
}