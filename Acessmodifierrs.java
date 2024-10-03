class Myemployee{
   private int id;
   private String name ;
   public String getName(){
    return name;
   }
   public void setname(String n){
    name =n;
   }
   public void setId(int i){
    id =1;
}
public int getId(){
    return id;
}
public class Acessmodifierrs {
    public static void main(String[] args){
        Myemployee harry = new Myemployee();
 // harry.id =90;
 // harry.name="ragini";
 harry.setname("ragini");
 System.out.println(harry.getName());


    }
}
}

 // WRONG HAI SHYD EK BAAR DOBAARA DEKHO //