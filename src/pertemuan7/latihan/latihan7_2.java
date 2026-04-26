package pertemuan7.latihan;

import java.util.Scanner;

public class latihan7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String huruf, hewan;

        System.out.println("Masukkan huruf(a/b): ");
        huruf = input.nextLine();  

        switch (huruf) {
            case "a":
                hewan = "ayam";
                System.out.println(hewan);
                break;
            case "b":
                hewan = "beruang";
                System.out.println(hewan);
                break;  
            default:
                System.out.println("manusia");
                break;
        }
    }
}
