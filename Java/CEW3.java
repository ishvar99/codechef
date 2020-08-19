package CODECHEF_BEGINNERS;

import java.math.BigInteger;
import java.util.Scanner;

class CEW3 {
    public static void main(String args[]){
        long n,m,t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while (t-->0) {
            n=s.nextInt();
            m=s.nextInt();
            if ((m >= 2 && n >= 2) || (m==1 && n>=2) || (n==1 && m>=2) ){
                System.out.println("1.000000");
            }
            else
                System.out.println("0.000000");
        }
    }
}
