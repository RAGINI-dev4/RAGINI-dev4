public class Arrayusingforloop {
    public static void main(String[] args) {
       
        int[] marks ={98,77,54,90,98};
      /*  System.out.println(marks.length);
    float[] student={66.7f,78.0f,88.9f};
      System.out.println(student.length);
     String[] name={"ragini" ,"dev","kriti"};
     System.out.println(name.length);
     System.out.println(name[2]);*/
     System.out.println("Printing using naive way");
     System.out.println(marks[0]);
     System.out.println(marks[1]);
     System.out.println("Printing using for loop");
     for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
     }
    }
}
