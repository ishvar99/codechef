package CODECHEF_BEGINNERS;

import java.util.Scanner;
class KS1_sample {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int res=0;
            long count=0;
            int n=s.nextInt();
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
            {
                a[i]=s.nextInt();
            }
            for(int i=1;i<n;i++){
                res=0;
                for (int j = i; j <=n; j++) {
                    res ^= a[j];
                    if(res==0){
                        count+=j-i;
                    }
                }
            }
            System.out.println(count);
        }
    }

}

