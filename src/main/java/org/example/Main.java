//untuk memasukkan di dalam file seusai nama file nya
package org.example;

//menggunakan import supaya bisa di persingkat
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

//system untuk membuat logikanya
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //system untuk memasukkan nama
        System.out.println("Nama:");
        String N = scanner.nextLine();

        //System untuk memasukkan jenis kelamin
        System.out.println("Jenis Kelamin (L/P):");
        //untuk mengabaikan besar kecilnya huruf
        char JK = scanner.next().charAt(0);

        //untuk memasukkan tanggal lahir
        System.out.println("Tanggal Lahir (tttt-bb-hh):");
        String TLStr = scanner.next();

        // Konversi tanggal lahir dari string ke LocalDate
        LocalDate TL = LocalDate.parse(TLStr);

        // Hitung umur menggunakan java.time.Period
        LocalDate TS = LocalDate.now();
        Period periode = Period.between(TL, TS);

        // untuk Menampilkan hasil
        System.out.println("\nOutput:");
        System.out.println(STR."Nama: \{N}");
        System.out.println(STR."Jenis Kelamin: \{JK == 'L' ? "Laki-laki" : "Perempuan"}");
        System.out.println(STR."Umur Anda: \{periode.getYears()} tahun \{periode.getMonths()} bulan");
    }
}
