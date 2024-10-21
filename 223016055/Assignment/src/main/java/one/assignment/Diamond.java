
package one.assignment;

import java.util.Scanner;


public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond: ");
        int r = sc.nextInt(); 

        
        for (int i = 1; i <= r; i++) {
           
            for (int c = i; c < r; c++) {
                System.out.print(" ");
            }
            
            for (int c = 1; c <= (2 * i - 1); c++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

       
        for (int i = r - 1; i >= 1; i--) {
          
            for (int c = r; c > i; c--) {
                System.out.print(" ");
            }
           
            for (int c = 1; c <= (2 * i - 1); c++) {
                System.out.print("*");
            }
          
            System.out.println();
        } 
}
}
