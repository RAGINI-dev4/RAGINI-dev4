class one{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){

    
        System.out.println("my name is java");
    }

}
class Two extends  one{
    public void swagat(){
        System.out.println("swagat hai");
    }
public void name(){
    System.out.println("my name is ragini");
}
}

public class dynamic {
    public static void main(String[] args) {
        //one obj=new one();
        Two obj=new Two();
        obj.name();
    }
}













