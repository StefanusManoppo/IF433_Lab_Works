package oop_00000121955_StefanusEdwardAzaryaManoppo.week06

interface Clickable {
    val name: String // Abstract property
    fun click()
    class Button(override val name: String) : Clickable {
        override fun click() {
            println("Tombol '$name' berhasil diklik!")
        }
    }
}