import java.util.*;
public class kadanes {
    public static void kadanesalgo(int num[]){
        // int maxsum=Integer.MIN_VALUE;
        // int currsum=0;

        // for(int i=0; i<num.length; i++){
        //     currsum=currsum + num[i];
        //     if(currsum < 0){
        //         currsum=0;
        //     }
        //     maxsum=Math.max(currsum , maxsum);
        // }
        // System.out.println("maximum sum = " + maxsum);
        int curr=0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            curr=curr+num[i];
            if(max<curr){
                max=curr;
            }
            if(curr<0){
                curr = 0;
            }
            // max=Math.max(curr,max);
        }
        System.out.println("maximum sum = " + max);
    }
    public static void main(String[] args) {
        int num[]= {-2,-3,4,-1,-2,1,5,-3};
        // int num[]={-1,-2,-3,-4};
        kadanesalgo(num);
    }
}
