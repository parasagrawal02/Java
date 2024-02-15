import java.util.*;
public class subarray {
    public static void printsubarray(int num[]){
        int ts=0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                int sum =0;
                for(int k=start; k<=end; k++){ //print
                    System.out.print(num[k] + " "); //subarray
                    sum +=  num[k];
                }
                System.out.println("the sum of this array is " + sum);
            }
            System.out.println();
        }
        System.out.print("total subarray = " + ts);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printsubarray(num);
    }
}
