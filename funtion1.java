
import java.util.Scanner;



public class funtion1 { 
    
public static int CalculatorSum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter the number");
    int b=sc.nextInt();
    int sum =a+b;
    System.out.println("sum is " + sum);
return sum;


}
    public static void main(String[] args) {
        CalculatorSum();
    }
}
//Methods or Functions are a block of code that accept certain parameters and perform actions whenever they are called.
 //Methods are always written inside a java class and can be called by simply referring to the method name.