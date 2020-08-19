package CODECHEF_BEGINNERS;

import java.util.Scanner;

class MAGICJAR
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int sum=0;
            int n=s.nextInt();
            int arr[]=new int[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=s.nextInt();
                sum+=arr[i];
            }
            System.out.println(sum-n+1);
        }
    }
}
