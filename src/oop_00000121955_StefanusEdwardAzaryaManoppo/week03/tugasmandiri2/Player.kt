package oop_00000121955_StefanusEdwardAzaryaManoppo.week03.tugasmandiri2

class Player(var username: String) {

    private var xp: Int = 0

    val level: Int
        get() {
            return (xp / 100) + 1
        }

    fun addXp(amount: Int) {
        if (amount > 0) {
            val previousLevel = level
            xp += amount

            if (level > previousLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}