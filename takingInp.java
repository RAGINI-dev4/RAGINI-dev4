
import java.util.Scanner;

public class takingInp {
   public static void main(String[] args) {
    try(Scanner scan = new Scanner(System.in)){
    System.out.println("enter the first number:");
    float a =scan.nextFloat();
    System.out.println("enter the second number:");
    float b= scan.nextFloat();
    float sum = a+b;
    System.out.println(sum);
   } 
}
}