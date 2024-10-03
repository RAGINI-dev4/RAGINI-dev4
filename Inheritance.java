class base{
    int a;
    public int getA() {
        System.out.println("i am a constructor");
        return a;
    }
    public void setA(int a) {
        System.out.println(" i am a constructor");
        this.a = a;
    }

}
class derived extends base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        base b= new base();
        b.setA(4);
        System.out.println(b.getA());
        b.getA();
        


    }
}
