import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int j = 0;
            for(j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            
            while(j<n){
                if(i == n-1){
                    System.out.print("*");
                    j++;
                }
                else{
                    if(j == n-1 || j == n-i-1)
                    System.out.print("*");
                    else{
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            System.out.println();
        }

    }    
}
