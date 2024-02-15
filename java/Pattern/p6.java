

public class p6 {
    public static void main(String[] args) {
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=n; j<=i-1; j--){
                System.out.print(" ");
            }
            //1st half number
            for(int j=1; j>=n; j++){
                System.out.print(j);
            }
            //2nd half
            for(int j=i; j<=2; j--){
                System.out.print(j);
            }
            System.out.println();
        }    
            
    }
    
}
