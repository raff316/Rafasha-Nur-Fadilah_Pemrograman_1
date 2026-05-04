// package pertemuan8.latihan;

// import java.util.Scanner;

// public class latihan8 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
    
//         for(int a=2; a <= 4; a++){
//             System.out.println("pengulangan" + " " + a);
//         }
        
//         while(int b <= 5){
//             System.out.println("pengulangan while" + " " + b);
//             b++;
//         }

//         int c = 1;

//         do{ 
//             System.out.println("Pengulangan do" + " " + c);
//             c++;
//         } while (c <= 5);
//     }
// }


package pertemuan8.latihan;

import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        for(int a = 2; a <= 4; a++){
            System.out.println("pengulangan for" + a);
        }
        
        int b = 1; 
        while(b <= 5){
            System.out.println("pengulangan while " + b);
            b++;
        }

        int c = 1;
        do { 
            System.out.println("Pengulangan do " + c);
            c++;
        } while (c <= 5);
    }
}

