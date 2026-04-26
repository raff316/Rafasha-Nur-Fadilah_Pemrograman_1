package pertemuan7.latihan;

import java.util.Scanner;

public class latihan7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String rasa = "", menu = "";

        System.out.print("Masukkan pilihan: ");
        pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            menu = "ayam goreng";
            System.out.println("Kamu pilih ayam goreng");
            System.out.print("Masukan rasa ayam goreng: ");
            rasa = input.nextLine();

        } else {
            System.out.println("tidak ada pilihan selain 1");
        }

        System.out.println("pilihan kamu: ");
        System.out.println(menu);
        System.out.println(rasa);
    }
}
