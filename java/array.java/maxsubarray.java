import java.util.*;
public class maxsubarray{
    public static void printmaxsubarray(int num[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                 curr=0;
                for(int k=start; k<=end; k++){
                    //subarray sumrandom
                    curr+=num[k];
                }
                if(maxsum<curr){
                    maxsum=curr;
                }
                System.out.println(curr);
            }
        }
        System.out.println("maximum sum = " + maxsum);
    }
    public static void main(String[] args) {
        //time complexity is big o of n cube
        // int num[]={1,-2,6,-1,3};
        // int num[]= {-2,-3,4,-1,-2,1,5,-3};
        int num[] = {2,4,6,8,10};
        printmaxsubarray(num);
    }
}