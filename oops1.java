

public class oops1 {
    String name;
    int Roll_no;
    public void printdata(){
        System.out.println(name);
        System.out.println(Roll_no);

    }
    public static void main(String[] args) {
      oops1 std1=new oops1();
std1.name="ragini";
System.out.println(std1.name);
std1.Roll_no=57;
System.out.println(std1.Roll_no);
oops1 std2=new oops1();
std2.name="sam";
std2.Roll_no=56;
std2.printdata();
    }
}
//change class name by student it will easier to understand...