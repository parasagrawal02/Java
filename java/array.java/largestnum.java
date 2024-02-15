import java.util.*;
public class largestnum {
    public static int getlargest(int number[]){
        int largest=Integer.MIN_VALUE; //-infintity
        int Smallest=Integer.MAX_VALUE; //+infinity

        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(Smallest > number[i]){
                Smallest = number[i];
            }
        }
        
        System.out.println("smallest number is :" + Smallest);
        return largest;
    } 
    public static void main(String[] args) {
        int number[]={1,6,5,9,8};
        System.out.print("largest value is :"+ getlargest(number));
        
    } 
}
