import java.util.*;
public class inclass{
    public void reverse(int num[]){
        int first=0; int last=num.length-1;
        while(first<last){
            //swap
            int temp = num[last];
            num[last] = num[first];
            num[first] = num[temp];

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        for(int i=0; i<=n; i++){
            System.out.print();
        }
    }
}