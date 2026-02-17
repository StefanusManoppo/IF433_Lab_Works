package oop_00000121955_StefanusEdwardAzaryaManoppo.week02.tugasmandiri1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("SISTEM DENDA PERPUSTAKAAN")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        println("LOG: Durasi tidak valid ($duration). Diubah otomatis menjadi 1 hari.")
        duration = 1
    }

    val myLoan = Loan(title, borrower, duration)

    println("\n--- DETAIL TRANSAKSI ---")
    println("Buku    : ${myLoan.bookTitle}")
    println("Peminjam: ${myLoan.borrower}")
    println("Durasi  : ${myLoan.loanDuration} hari")

    println("DENDA   : Rp ${myLoan.calculateFine()}")
}