package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class Fruits {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n,m,k,min,min1;
             n=s.nextInt();
             m=s.nextInt();
             k=s.nextInt();
             min=n-m;
             min1=m-n;
            if(n==m)
            {
                System.out.println("0");
            }

            else if(n > m)
            {
                for(int i=1;i<=k;i++)
                {
                    m++;
                    if((n-m)<min && (n-m)>=0)
                    {
                        min=n-m;
                    }
                }
                System.out.println(min);
            }
            else {
                for(int i=1;i<=k;i++)
                {
                    n++;
                    if((m-n)<min1 && (m-n)>=0) {
                        min1=m-n;
                    }
                }
                System.out.println(min1);
            }
            t--;
        }
    }
}
