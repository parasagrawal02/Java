import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int j = 0;
            for(j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            while(j<n){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }

    }
}
