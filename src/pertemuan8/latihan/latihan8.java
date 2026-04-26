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
    
        // 1. For Loop: Perfect for when you know the exact range.
        for(int a = 2; a <= 4; a++){
            System.out.println("pengulangan for" + a);
        }
        
        // 2. While Loop: Fixed. 'b' must be declared and initialized outside.
        int b = 1; 
        while(b <= 5){
            System.out.println("pengulangan while " + b);
            b++;
        }

        // 3. Do-While Loop: This is correct. 
        // It will always run at least once because the condition is checked at the end.
        int c = 1;
        do { 
            System.out.println("Pengulangan do " + c);
            c++;
        } while (c <= 5);
    }
}

