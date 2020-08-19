package CODECHEF_BEGINNERS;
import java.util.Arrays;
import java.util.Scanner;

class ZOMCAV {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            long sum1=0;
            long sum2=0;
            int [] rp=new int[n+1];
            int rl[]=new int[n+1];
            int d[]=new int[n+2];
            Arrays.fill(rl, 0);
            int h[]=new int[n+1];
            for(int i=1;i<=n;i++){
              rp[i]=s.nextInt();
            }
            d[1]=rl[1];
            d[n+1]=0;
            for(int i=2;i<=n;i++)
            {
                d[i]=rl[i]-rl[i-1];
            }
            for(int i=1;i<=n;i++){
                h[i]=s.nextInt();
                sum2+=h[i];
            }
            for(int i=1;i<=n;i++){
                int x=i-rp[i];
                if(x<=0)
                    x=1;
                int y=i+rp[i];
                if(y>n)
                    y=n;
                d[x] += 1;
                d[y + 1] -= 1;
            }
            for(int i=1;i<=n;i++){
                if(i==1)
                    rl[i]=d[i];
                else
                rl[i]=d[i]+rl[i-1];
                sum1+=rl[i];
            }
            if(sum1==sum2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
