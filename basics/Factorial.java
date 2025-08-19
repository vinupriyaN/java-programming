package basics;
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a  integer: ");
        int number = input.nextInt();
        long fact = 1;
            for (int i = 1; i <= number; i++) {
                 fact*=i;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        }
    }
    

