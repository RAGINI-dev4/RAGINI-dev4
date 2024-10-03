

class Base1 {
   void Base1(){
        System.out.println("I  AM A CONSTRUCTOR");
    }

public void Derived() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Derived'");
}
    
}
class Derived extends Base1{
 void Derived(){
    System.out.println("i am a ragini");
}
        
    

public class ConstructorinInheritance {
    public static void main(String[] args) {
        Base1 b= new Base1();
        b.Base1();
        b.Derived();
    
//Derived d= new Derived();
    }
}
