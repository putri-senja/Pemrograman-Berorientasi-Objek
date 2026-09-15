/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    // Atribut tambahan bersifat private
    private double gaji;

    // Constructor untuk inisialisasi semua atribut
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor induk
        this.gaji = gaji;
    }

    // Metode getter dan setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan semua informasi pekerja
    @Override
    public String toString() {
        return "=== Rincian Data Pekerja ===\n" +
               "Nama      : " + getNama() + "\n" +  // Diakses menggunakan getter karena private di induk
               "Usia      : " + usia + " tahun\n" +    // Bisa diakses langsung karena protected
               "Pekerjaan : " + pekerjaan + "\n" +   // Bisa diakses langsung karena public
               "Gaji      : Rp " + (long) gaji;
    }
}