import java.util.*;
public class arguments {
    public static void update(int marks[],int nonchangeable){
        nonchangeable=10;
        for(int i=0; i<marks.length; i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={90,91,92};
        int nonchangeable= 5;
        update(marks,nonchangeable);

        System.out.println(nonchangeable+" ");

        //print our marks
        for(int i=0; i<=marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();

    }
}
