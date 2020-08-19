package CODECHEF_BEGINNERS;

import java.util.Scanner;

public class MSNSADM1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int total=0;
            int max=0;
            int n=s.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=s.nextInt();
            }
            for(int i=0;i<n;i++){
                total+=a[i]*20-b[i]*10;
                total=total<0?0:total;
                if(total>max){
                    max=total;
                }
                total=0;
            }
            System.out.println(max);
        }
    }
}
