public class productbycallbyvalue { 
    public static int product(int a,int b){
        int product=a*b;
        return product;
    }
  public static void main(String[] args) {
    int a=3;
    int b=5;
       int   prod = product(a,b);
    System.out.println("product :" +prod);
    prod=product(10,20);
System.out.println("product :" +prod);
  }  
}
//In Java, call by value passes a copy of the variable to the method, 
//so all changes are reflected only in that method; thus, no changes are reflected in the main method.