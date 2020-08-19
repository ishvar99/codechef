package CODECHEF_BEGINNERS;

import java.util.Scanner;
public class factorial_recursion {
    public static int Fact(int n){
        if(n==1)
            return 1;
        return n*Fact(n-1);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(Fact(n));
    }
}
