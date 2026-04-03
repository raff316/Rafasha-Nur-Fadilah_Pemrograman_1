package pertemuan4.latihan;

import java.util.Scanner;

    public class Latihan2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);  
            float realisasi, kehadiran, tugas, UTS, UAS;

            System.out.print("Jumlah Pertemuan: ");
            realisasi = input.nextFloat();

            System.out.print("Jumlah Kehadiran: ");
            kehadiran = input.nextFloat();

            System.out.print("Nilai Tugas: ");
            tugas = input.nextFloat();

            System.out.print("Nilai UTS: ");
            UTS = input.nextFloat();

            System.out.print("Nilai UAS: ");
            UAS = input.nextFloat();

            double bobotkehadiran = ((double)kehadiran/realisasi)*10;
            double bobottugas = (tugas*20/100);
            double bobotUTS = (UTS*30/100);
            double bobotUAS = (UAS*40/100);
            double Total = bobotkehadiran + bobottugas + bobotUTS + bobotUAS;

            System.out.print("jumlah kehadiran: " + realisasi);
            System.out.println("/" + kehadiran);
            System.out.println("Nilai Tugas: " + tugas);
            System.out.println("Nilai UTS: " + UTS);
            System.out.println("Nilai UAS: " + UAS);
            System.out.println("Total: " + Total);
        }
    }