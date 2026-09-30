/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum02;

public class main {

    public static void main(String[] args) {
        Barang barang1 = new Barang(
                "BRG-001",
                "keybord USB",
                10,
                "Laboratorium Komputer");

        Barang barang2 = new Barang(
                "BRG-002",
                "Keyboard",
                5,
                "Laboratorium Komputer");

        System.out.println("=== DAFTAR BARANG ===");
        System.out.println(barang1.tampilkanInfo());
        System.out.println(barang2.tampilkanInfo());

        barang1.setStok(12);

        System.out.println("=== SETELAH STOK DIUBAH ===");
        System.out.println(barang1.tampilkanInfo());

        try {
            barang2.setStok(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Input ditolak: " + e.getMessage());
        }

        System.out.println(
                "Stok Keyboard tetap: " + barang2.getStok());
    }
}
