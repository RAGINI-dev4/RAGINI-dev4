
import java.util.Scanner;

public class functionWITHparameter {
    public static int Parameters(int a, int b){
        int sum =a+b; 
        System.out.println("sum is:"+sum);
        return sum;
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    Parameters(a,b);

    }
}
//Parameters are nothing but the variables that are passed inside the parenthesis of a method.
// We can pass a single or more than one parameter of different datatypes inside our method.