package pertemuan7.tugas;

import java.util.Scanner;

public class tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, kopi = 0, non_kopi = 0, rasa = 0;
        String pesanan = "";    

        System.out.println("menu kedai kopi: ");
        System.out.println("1. Coffe");
        System.out.println("2. Non Coffe");
        System.out.print("Pilih Menu: ");
        menu = input.nextInt();     

        if (menu == 1) {
            System.out.println("1. Americano");
            System.out.println("2. Coffee Latte");
            System.out.print("Pitlih Kopi Anda: ");
            kopi = input.nextInt();

            if (kopi == 1) {
                pesanan = "Americano";
            } else if (kopi == 2) {
                pesanan = "Coffee Latte";
            } else {
                pesanan = "Kopi tidak tersedia";
            }

        } else if (menu == 2) {
            System.out.println("1. Ice Tea");
            System.out.println("2. Thai Tea");
            System.out.println("3. Juice");
            System.out.print("Silahkan masukan pilihan anda: ");
            non_kopi = input.nextInt();

            if (non_kopi == 1) {
                pesanan = "Ice Tea";
            } else if (non_kopi == 2) {
                pesanan = "Thai Tea";
            } else if (non_kopi == 3) {
                System.out.println("1. Alpukat");
                System.out.println("2. Mangga");
                System.out.println("3. Jambu");
                System.out.print("Pilih rasa jus yang anda inginkan: ");
                rasa = input.nextInt();

                if (rasa == 1) {
                    pesanan = "Alpukat";
                }
                else if (rasa == 2) {
                    pesanan = "Mangga";
                }
                else if (rasa == 3) {
                    pesanan = "Jambu";
                } else {
                    pesanan = "Rasa Jus Tidak tersedia";
                }

            } else {
                System.out.println("Rasa tidak tersedia");
            }
        }

        else {
            System.out.println("Menu tidak tersedia");
        }

        System.out.println("Pesanan Anda: " + pesanan); 
    }
}
