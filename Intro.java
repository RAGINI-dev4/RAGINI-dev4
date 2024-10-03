import java.util.Scanner;
public class Intro {
    public static void main(String[] args) {
        System.out.println("NAME AND IDENTIFICATION");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("YOUR NAME: ");
            String str = sc.next();
   System.out.println("HELLO "+str);
        }
        System.out.println("HAVE A GOOD DAY");
    try (Scanner q = new Scanner(System.in)) {
        System.out.println("AGE:");
int age = q.nextInt();
System.out.println("OK");
if(age>18){
System.out.println("YOU ARE APPLICABLE");
}
else{
        System.out.println("YOU ARE NOT APPLICABLE");
}
    }
}
    }


