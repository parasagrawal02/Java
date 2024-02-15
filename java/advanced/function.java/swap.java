import java.util.*;
public class swap {
    
    public static int calculatesum(int a,int b){ //parameters or formal parameters
        int sum = a+b;
        return sum;
    }
    public static void swap(int a, int b){
 //swap
        int temp = a;
        a=b;
        b= temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=8;
        swap (a,b);

       
    }
}
