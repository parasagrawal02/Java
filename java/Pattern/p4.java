
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        for(int i = n;i>=1;i--){
            if(i == n){

            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = i*2-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        else{

            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int j = i*2-1;j>=1;j--){
                if(j == i*2-1 || j == 1)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }
}
