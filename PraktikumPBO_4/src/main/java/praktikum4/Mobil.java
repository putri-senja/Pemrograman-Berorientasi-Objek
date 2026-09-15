/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; // Atribut tambahan khusus untuk mobil

    // Constructor Subclass
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        // Memanggil constructor dari kelas induk (Kendaraan)
        super(nama, kecepatanMaks, jenisMesin); 
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk menampilkan informasi spesifik mobil
    public void tampilkanInfoMobil() {
        // Atribut 'kecepatanMaks' bisa diakses langsung karena bersifat protected
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

