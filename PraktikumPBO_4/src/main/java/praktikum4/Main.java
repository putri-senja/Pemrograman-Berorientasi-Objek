/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String[] args) {
        // 1. Buat objek dari kelas Pekerja
        Pekerja karyawan = new Pekerja("Andi", 30, "Software Engineer", 12000000);

        // 2. Tampilkan informasi pekerja menggunakan metode toString()
        System.out.println(karyawan.toString());
        System.out.println();

        // 3. Ubah nama pekerja menggunakan metode setter dan tampilkan ulang
        karyawan.setNama("Andi Wijaya");
        System.out.println("--- Setelah Nama Diubah ---");
        System.out.println(karyawan.toString());
        System.out.println();

        // 4. Analisis Akses Langsung Atribut (Pertanyaan Soal)
        System.out.println("--- Analisis Akses Atribut Langsung ---");
        
        // Atribut 'pekerjaan' bersifat public, bisa diakses langsung
        System.out.println("Akses pekerjaan langsung: " + karyawan.pekerjaan); 

        // JIKA BARIS DI BAWAH INI DIHIDUPKAN, MAKA AKAN EROR:
        // System.out.println(karyawan.nama); // ❌ Eror! Karena 'nama' bersifat private di kelas Manusia
        // System.out.println(karyawan.gaji); // ❌ Eror! Karena 'gaji' bersifat private di kelas Pekerja
        
        // Atribut 'usia' bersifat protected, bisa diakses langsung di sini KARENA kelas Main berada di package yang sama (praktikum4)
        System.out.println("Akses usia langsung     : " + karyawan.usia); 
    }
}

