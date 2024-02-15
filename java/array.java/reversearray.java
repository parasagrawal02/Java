import java.util.*;
public class reversearray {
    public static int reverse(int num[]){
        int first=0 ,last=num.length-1;

        while(first < last){
            //swap
            int temp=num[last];
            num[last]= num[first];
            num[first]= temp;

            first++;
            last--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,3,5,7,9};
        
        reverse(num);

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
