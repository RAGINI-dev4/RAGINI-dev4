class SOLution{
    static double switchCase(int choice,int[]arr){
    switch(choice){
        case 1 -> {
            int R=arr[0];
            return Math.PI*R*R;
            }
            case 2 -> {
                int L= arr[0];
                int B= arr[1];
                return L*B;
            }
                default -> {
                    return -1;
            }
    }
}
public static void main(String[] args){
    System.out.println(switchCase(1,  new int[]{5}));
     System.out.println(switchCase(2,  new int[]{5,10}));
}
}