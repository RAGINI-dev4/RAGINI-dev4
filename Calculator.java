import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter the first number");
        int a =sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("operator:");
        char operator=sc.next().charAt(0);

switch (operator) {
    case '+' -> System.out.println(a+b);
    case '-' -> System.out.println(a-b);
    case'*' -> System.out.println(a*b);
    case'/' -> System.out.println(a/b);
    case'%' -> System.out.println(a%b);
    
    default -> System.out.println("wrong operator");
}

    }
}
