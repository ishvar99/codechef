package CODECHEF_BEGINNERS;

import java.util.Scanner;

public class fibonacci_loops {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,sum=0;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(b);
    }
}
