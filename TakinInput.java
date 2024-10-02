import java.util.Scanner;
public class TakinInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("ENTER THE NUMBER 1: ");
       int a = sc.nextInt();
        System.out.println("ENTER THE NUMBER 2: ");
    int b = sc.nextInt();
int sum = a+b;
System.out.println("THE SUM OF THE NUMBER IS:"+sum);
    }
    }
}