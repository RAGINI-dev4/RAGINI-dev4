public class Vararrag {
    static int sum(int ...arr){
      int result =  0;
      for(int a: arr){
        result+=a;
      }
      return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of  4 and 5 is:-"+sum( 4, 5));
        System.out.println("The sum of 4,6 and 6:-"+sum( 4,6,6 ));
    }
}