package pertemuan8.tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class tugas8 {
    public static void main(String[] args) {
        // 1. Inisialisasi Scanner dan ArrayList
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarNama = new ArrayList<>();
        String jawaban;

        // 2. Loop untuk mengambil input
        while (true) {
            System.out.print("Masukkan nama (atau ketik 'selesai' untuk berhenti): ");
            jawaban = input.nextLine();
            // Cek kondisi berhenti
            if (jawaban.equalsIgnoreCase("selesai")) {
                break;
            }
            // Menambahkan data ke dalam list
            daftarNama.add(jawaban);
        }

        // Menampilkan isi list
        System.out.println("\n--- Daftar Nama yang Diinput ---");
        for (int i = 0; i < daftarNama.size(); i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + daftarNama.get(i));
        }
    }
}