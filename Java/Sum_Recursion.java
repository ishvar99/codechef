package CODECHEF_BEGINNERS;

import java.util.Scanner;

public class Sum_Recursion {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sn=n+sum(n-1);
        return sn;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(sum(n));
    }
}
