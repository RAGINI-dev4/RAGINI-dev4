import java.util.Scanner;
public class Switch18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        try (Scanner sc = new Scanner(System.in)) {
            age = sc.nextInt();
        }
        switch(age){
    case 19:
    System.out.println("You are going to be adult!");
    break; 
    case 23 :
    System.out.println("YOU ARE GOING TO GET jOB!");
break;
case 60:
System.out.println("YOU ARE GOING TO RETRIED!");
break;
default:
System.out.println(" ENJOY YOUR LIFE!!");
}
    }
}


        /* 
        if(age>56){
            System.out.println("You are Experienced");
         }
         else if(age>46){
            System.out.println("You are Semi- Experienced");
         }
         else if (age>36){
            System.out.println("You are not Experienced");
         }*/
        
