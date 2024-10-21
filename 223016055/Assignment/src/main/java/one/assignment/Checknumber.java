
package one.assignment;

import java.util.Scanner;


public class Checknumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = sc.nextInt();

        if (a > 0)
        {
            System.out.println("Number is positive");
        }
        else if (a < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
