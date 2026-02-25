package oop_00000121955_StefanusEdwardAzaryaManoppo.week04.tugasmandiri2

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}