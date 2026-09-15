/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("Nono", 7);
        anjing.Berlari();
        anjing.info();
        
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Wuling", "BYD", 2024, "Putih");
        
        mobil1.displayInfo();
        mobil1.startEngine();
        
        mobil2.displayInfo();
        mobil2.startEngine();
    }
}
