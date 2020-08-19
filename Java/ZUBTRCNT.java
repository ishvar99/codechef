package CODECHEF_BEGINNERS;

import java.util.Scanner;

public class ZUBTRCNT {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int j=1;j<=t;j++)
        {
            int l=s.nextInt();
            int k=s.nextInt();
            int count=0;
            for(int i=1;i<=l-k+1;i++){
                count+=i;
            }
            System.out.println("Case "+j+": "+count);
        }
    }
}
