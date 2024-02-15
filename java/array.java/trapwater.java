import java.util.*;
public class trapwater {
    public static int trappingrainwater(int height[]){
        int n=height.length;
        //left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0]=height[0];
        for(int i=1; i<n; i++){
            leftmax[i]=Math.max(height[i] , leftmax[i-1]);
        }
        //right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n-1]= height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);  
        }
        int trapwater = 0;
        //loop
        for(int i=0; i<n; i++){
        //waterlevel = min(left max boundary, right max boundary)
        int waterlevel = Math.min(leftmax[i] , rightmax[i]);
        //trapwater = waterlevel-hieght[i]
        trapwater += waterlevel-height[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.print(trappingrainwater(height));
    }
}
