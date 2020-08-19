package CODECHEF_BEGINNERS;
import java.util.Scanner;
class HMAPPY2
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int a=s.nextInt();
            int b=s.nextInt();
            int k=s.nextInt();
            int g=1;
            for(int i=1;i<=a && i<=b;++i)
            {
                if(a%i==0 && b%i==0)
                    g=i;
            }
            int lcm =(a*b)/g;
            int ans=(n/a)+(n/b)-2*(n/lcm);
            if(ans>=k)
                System.out.println("win");
            else
                System.out.println("lose");
        }
    }
}
