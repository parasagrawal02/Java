public class floydstriangle {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        //outerloop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
             System.out.print(number+" ");
             number++; //num=num+1
            }
            System.out.println();

        }
    
    }
}
