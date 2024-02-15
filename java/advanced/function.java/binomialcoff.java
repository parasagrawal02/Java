import java.util.*;
public class binomialcoff {
    public static int binomialcoff(int n,int r){
       int factorial_n= factorial(n);
       int factorial_r= factorial(r);
       int factorial_nmr= factorial(n-r);

       int binomialcoff = (factorial_n)/(factorial_r*factorial_nmr);
       return binomialcoff ;
    }

     public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return factorial(n-1)*n;
    }
    // //function to calculate sum of two num
    // public static int sum(int a,int b){
    //     return a+b;
    // }

    // //function to calculate sum of three num
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    //sum of 2 int values
    public static int sum(int a, int b){
        return a+b;
    }
    //sum of two float values
    public static float sum(float a, float b){
        return a+b;
    }
    // public static boolean isprime(int n){
    //     //corner case
    //     //2
    //     if(n==2){
    //         return true;
    //     }

    //     for(int i=2; i<=n-1; i++){
    //         if(n%i==0)//completely divided
    //         return false;
            
    //     }
    //     return true;
    // }
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void primeinrange(int n){
        for(int i=2; i<=n; i++){  
            if(isprime(i)){ //true
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
    public static void bintodec(int binnum){
        int pow=0;
        int decnum=0;

        while(binnum > 0){
            int lastdigit = binnum % 10;
            decnum = (int) (decnum + lastdigit * Math.pow(2, pow));
        }
    }
    public static void main(String[] args) {
      primeinrange(20); //2 to 20
    }

}