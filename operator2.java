
import java.util.Scanner;

public class operator2 {
    public static void main(String[] args) {
     try(Scanner sc =new Scanner(System.in)){
        System.out.println("ENTER THE TOTAL MARKS");
        int a =sc.nextInt();
     try(Scanner sr =new Scanner(System.in)){
        System.out.println("ENTER THE OBTAINED MARKS");
        int b =sr.nextInt();
         float percentage = a/b*100;
         System.out.println("percentage is :"+percentage);
   
     }
     }

        }
        
}
 