package pertemuan4.tugas;

import java.util.Scanner;

public class Tugas2 {   

      public static double Hasil(double kehadiran, double realisasi, double tugas, double UTS, double UAS) {
            double bobotkehadiran = (kehadiran/realisasi)*10;
            double bobottugas = (tugas*20)/100;
            double bobotUTS = (UTS*30)/100;
            double bobotUAS = (UAS*40)/100;

            return bobotkehadiran + bobottugas + bobotUTS + bobotUAS; 
            }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);  

            float realisasi, kehadiran, tugas, UTS, UAS;

            System.out.println("Jumlah Pertemuan: ");
            System.out.println("1.) 2 SKS (14 Pertemuan): ");
            System.out.println("2.) 3 SKS (21 Pertemuan): ");
            System.out.print("Masukkan pilihan (1/2): ");  
            realisasi = input.nextFloat();  

            if (realisasi == 1) {
                realisasi = 14;
            } else if (realisasi == 2) {
                realisasi = 21;
            } else {
                System.out.println("Tidak valid");
                return;
            }

            System.out.print("Jumlah Kehadiran: ");
            kehadiran = input.nextFloat();

            System.out.print("Nilai Tugas: ");
            tugas = input.nextFloat();

            System.out.print("Nilai UTS: ");
            UTS = input.nextFloat();

            System.out.print("Nilai UAS: ");
            UAS = input.nextFloat();

            double Total = Hasil(kehadiran, realisasi, tugas, UTS, UAS);
            String nilai;

            if (Total >= 90) {
                nilai = "A";
            } else if (Total >= 80) {
                nilai = "B";
            } else if (Total >= 70) {
                nilai = "C";
            } else {
                nilai = "D";
            }

            System.out.println("\njumlah kehadiran: " + kehadiran + "/" + realisasi);
            System.out.println("Nilai Tugas: " + tugas);
            System.out.println("Nilai UTS: " + UTS);
            System.out.println("Nilai UAS: " + UAS);
            System.out.println("Total: " + Total + "|" + nilai);
        }
    }
    

