import java.util.*;
public class multiply{
    
    public static int multiply(int a,int b){
     int product=a*b;
    return product;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int product = multiply(a, b);
        System.out.println("a*b="+product);
        product = multiply(58, 76);
        System.out.println("a*b="+product);
    }
}