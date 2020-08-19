package CODECHEF_BEGINNERS;
import java.util.*;
import java.lang.*;
class ADASTAIR
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int count=0;
            int n=s.nextInt();
            int a[]=new int[n+1];
            int k=s.nextInt();
            a[0]=0;
            for(int i=1;i<=n;i++){
                a[i]=s.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;;j+=k){
                    if(a[i+1]-a[i]+j>k)
                        count++;
                    else
                        break;
                }
            }
            System.out.println(count);
        }
    }
}