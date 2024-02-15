import java.util.*;
public class binarysearch {
    //binary search
    public static int Searching(int num[], int key){
        int start=0 , end=num.length-1;

        while(start <= end){
            int mid=(start+end)/2;

            if(num[mid]==key){
                return mid;
            }
            if(num[mid]>key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,3,5,7,9};
        int key=15;

        System.out.print("index for key is :" + Searching(num,key));
    }
}
