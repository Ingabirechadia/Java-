
package one.assignment;
import java.util.Scanner;
public class GradeComment {
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = sc.next().toUpperCase().charAt(0);
        switch (grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Fair");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        } 
} 
}
