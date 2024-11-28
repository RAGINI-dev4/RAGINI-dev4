
//introduction of inheritance.....
 class parentclass{
    void display(){
        System.out.println("parent class defined");
    }
}
 
 class childClass extends parentclass{
    void show(){
        System.out.println("CHILD CLASS EXTENDS");
    }
 }
 
 
 
 
 
 public class inheritaance11 {
    public static void main(String[] args) {
        childClass child1 =new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
