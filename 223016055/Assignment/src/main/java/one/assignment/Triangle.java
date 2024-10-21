
package one.assignment;
public class Triangle {
    public static void main(String[] args) {
        int r = 7; 

        for (int i = 1; i <= r; i++) {
            for (int c = 1; c<= i; c++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }  
}
