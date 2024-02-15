import java.util.*;
public class linearsearch {
    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,5,7,9,15};
        int key=15;

        int index= linearSearch(num, key);
        if (index ==-1){
            System.out.print("key is not found");
        }else
        System.out.print("key is found at index :" + index);

    }
}
