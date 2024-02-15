import java.util.*;
public class prefixsum{
    public static void printprefixsum(int num[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        prefix[0] = num[0];
        //calcuate prefix array
        for(int i=1; i<num.length; i++){
            prefix[i]= prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=i; j<num.length; j++){
                int end=j;
                 curr = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(maxsum<curr){
                    maxsum=curr;
                }
                System.out.println(curr);
            }
        }
        System.out.println("maximum sum = " + maxsum);
    }
    public static void main(String[] args) {
        //time complexity = big o of n sqauare
        int num[]={1,-2,6,-1,3};
        printprefixsum(num);
    }
}