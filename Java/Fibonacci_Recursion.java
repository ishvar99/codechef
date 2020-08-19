package CODECHEF_BEGINNERS;

import java.util.Scanner;

public class Fibonacci_Recursion {
    public static int series(int r){
        if(r<=1)
            return r;
        else
            return series(r-1)+series(r-2);
    }
    public static void main(String args[]){
 Scanner s=new Scanner(System.in);
 int r=s.nextInt();
 System.out.print(series(r));
    }
}
