
package one.assignment;


public class Average {
     public static void main(String[] args) {
        
        int[] numberArr = { 10,12,34,23,56,78 };
        
       
        int sum = 0;
        for (int i = 0; i < numberArr.length; i++) {
            sum += numberArr[i];
        }
        
      
        double average = (double) sum / numberArr.length;
        
        
        System.out.printf("The average is: %.2f%n", average);
    }
}
