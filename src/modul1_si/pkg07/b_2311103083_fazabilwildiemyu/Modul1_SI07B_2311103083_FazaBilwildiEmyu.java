/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1_si.pkg07.b_2311103083_fazabilwildiemyu;

import java.util.Scanner;

/**
 *
 * @author Faza Bilwildi Emyu_2311103083_SI-07-B
 */
public class Modul1_SI07B_2311103083_FazaBilwildiEmyu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaHewan;
        int jumlahHewan;
        String infoTambahan;
        int pilih = 0;

        Scanner scanner = new Scanner(System.in);
        ManajemenKebunBinatang MKB = new ManajemenKebunBinatang(20); 

        // Tambah perulangan untuk menambah pesanan (do-while)
        do {
            System.out.println("\n========= Menu Manajemen Hewan =========\n");
            System.out.println("1. Tambah Hewan Darat");
            System.out.println("2. Tambah Hewan Air");
            System.out.println("3. Tampilkan Semua Hewan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilih = scanner.nextInt();
            scanner.nextLine(); // Bersihkan buffer 

            switch (pilih) {
                case 1:
                    System.out.print("Nama Hewan Darat: ");
                    namaHewan = scanner.nextLine();

                    System.out.print("Jumlah: ");
                    jumlahHewan = scanner.nextInt();
                    scanner.nextLine(); // Bersihkan buffer 

                    System.out.print("Habitat: ");
                    infoTambahan = scanner.nextLine();

                    Hewan hewanDarat = new Hewan(namaHewan, jumlahHewan, "Darat", infoTambahan);
                    MKB.tambahHewan(hewanDarat);
                    break;
                case 2:
                    System.out.print("Nama Hewan Laut: ");
                    namaHewan = scanner.nextLine();

                    System.out.print("Jumlah: ");
                    jumlahHewan = scanner.nextInt();
                    scanner.nextLine(); // Bersihkan buffer 

                    System.out.print("Kedalaman Air: ");
                    infoTambahan = scanner.nextLine();

                    Hewan hewanAir = new Hewan(namaHewan, jumlahHewan, "Air", infoTambahan);
                    MKB.tambahHewan(hewanAir);
                    break;
                case 3:
                    MKB.tampilkanSemuaHewan();
                    break;
                default:
                    System.out.println("Pilihan Yang anada masukkan tidak valid");
                    break;
            }
        } while (pilih != 4);
        System.out.println("Keluar dari Program.");
    }

}
