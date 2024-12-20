/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_si.pkg07.b_2311103083_fazabilwildiemyu;

/**
 *
 * @author Faza Bilwildi Emyu_2311103083_SI-07-B
 */
public class Hewan {

    String nama;
    int jumlah;
    String kategori;
    String atributTambahan;

    public Hewan(String nama, int jumlah, String kategori, String atributTambahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.kategori = kategori;
        this.atributTambahan = atributTambahan;
    }

    public void tampilkanData() {
        System.out.println("Nama Hewan: " + nama + "\nJumlah:" + jumlah + "\nJenis Hewan: " + kategori + "\nInformasi Tambahan: " + atributTambahan);
    }
}
