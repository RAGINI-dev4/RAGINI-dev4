 class Empolyee{
    int id;
    String name;
    int getsalary;
    String post;
    public void printdetails(){
        System.out.println(" The id is "+id);
        System.out.println(" The name is "+name);
  System.out.println("The salary of empolyee "+getsalary);
  System.out.println(" Post of the empolyee "+post);
    }
 }
public class Class {
    public static void main(String[] args) {
        System.out.println(" DETAILS OF EMPOLYEE ");
   Empolyee xyz = new Empolyee();
   Empolyee john= new Empolyee ();
   
   xyz.id=12;
   xyz.name="jerry";
   xyz.getsalary =60000;
xyz.post="Software developer";
   john.id =22;
   john.name="tom";
   john.getsalary=900000;
   john.post= "HOD";
   xyz.printdetails();
john.printdetails();    }
}
