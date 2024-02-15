

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        for(int i = n;i>=1;i--){
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = i*2-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
