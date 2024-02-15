import java.util.*;
 class basics {
    
    public static int calculatesum(int a,int b){ //parameters or formal parameters
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int a = Scn.nextInt();
        int b = Scn.nextInt();
        int sum = calculatesum(a,b); //arguments or actual parameters
        System.out.println("sum is :" + sum);
    }
}
