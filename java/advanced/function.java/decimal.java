import java.util.*;
public class decimal{
    public static void intdec(int num){
        int mynum=num;
        int pow=0;
        int dec=0;
        while(num>0){
            int ld=num%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            num=num/10;
            
        }
        System.out.println("decimal of"+mynum+"="+dec);
    }
    public static void main(String[] args) {
        intdec(101);
    }
}


    

