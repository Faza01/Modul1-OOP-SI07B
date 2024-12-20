/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_si.pkg07.b_2311103083_fazabilwildiemyu;

/**
 *
 * @author Faza Bilwildi Emyu_2311103083_SI-07-B
 */
public class ManajemenKebunBinatang {

    Hewan[] DaftarHewan;
    int JmlHewan;

    public ManajemenKebunBinatang(int kapasitas) {
        DaftarHewan = new Hewan[kapasitas];
    }

// Method untuk menambahkan pesanan 
    public void tambahHewan(Hewan item) {
        DaftarHewan[JmlHewan] = item;
        JmlHewan++;
    }

    public void tampilkanSemuaHewan() {
        System.out.println("Daftar Hewan di Kebun Binatang:");
        for (int i = 0; i < JmlHewan; i++) {
            System.out.println("==========================");
            System.out.println("Hewan ke-" + (i + 1));
            DaftarHewan[i].tampilkanData();
        }
    }
}
