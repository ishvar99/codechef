package CODECHEF_BEGINNERS.NOV19B;

import java.util.Scanner;

class hrdseq {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int seq[]=new int[n+1];
            seq[1]=0;
            for(int i=1;i<n;i++){
                int flag=0;
                for(int j=i-1;j>=1;j--){
                   if(seq[j]==seq[i]){
                       seq[i+1]=i-j;
                       flag=1;
                       break;
                   }
                }
                if(flag==0)
                    seq[i+1]=0;
            }
            int count=0;
            for(int i=1;i<=n;i++){
                if(seq[i]==seq[n])
                    count++;
            }
            System.out.println(count);
        }
    }
}
