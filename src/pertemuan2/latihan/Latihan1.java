   package pertemuan2.latihan;
   
   import java.util.Scanner;

    public class Latihan1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);  
            String nama, NIM, gender;
            int usia, pilihan;   

            System.out.print("Nama: ");
            nama = input.nextLine();

            System.out.print("NIM: ");
            NIM = input.nextLine();
            
            System.out.print("Usia: ");
            usia = input.nextInt();

            System.out.println("\nPilih Gender: ");
            System.out.println("1. Laki-laki: ");
            System.out.println("2. Perempuan: ");
            System.out.print("Masukkan Pilihan (1/2): ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                gender = "Laki-laki";
            } else if (pilihan == 2) {
                gender = "Perempuan";
            } else {
                gender = "Tidak Valid";
            }

            // Output
            System.out.println("\nData Mahasiswa: ");
            System.out.println("nama: " + nama);
            System.out.println("NIM: " + NIM);
            System.out.println("Usia: " + usia + " tahun");
            System.out.println("Gender: " + gender);
        }   
    }
