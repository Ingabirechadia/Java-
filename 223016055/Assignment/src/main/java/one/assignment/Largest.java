
package one.assignment;

import java.util.Scanner;

public class Largest {
     public static void main(String[] args)   
{  
int num1, num2, num3, largest;
Scanner sc = new Scanner(System.in);  

System.out.println("Enter the first number:");  
num1= sc.nextInt();  
System.out.println("Enter the second number:");  
num2= sc.nextInt();  
System.out.println("Enter the third number:");  
num3 = sc.nextInt();  
if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2>= num3)
            System.out.println(num2+ " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");
    }  
}
