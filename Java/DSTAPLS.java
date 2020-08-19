package CODECHEF_BEGINNERS;

import java.util.Scanner;

public class DSTAPLS {

    public static void main(String args[]){
        long x;
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            long n=s.nextLong();
            long k=s.nextLong();
            long div=n/k;
            System.out.println(div);
            if(div%k==0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
