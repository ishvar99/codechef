package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class Big_Sale {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int n=s.nextInt();
            int a[]=new int[3];
            double p=0,q=0,r=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<3;j++)
                {
                       a[j]=s.nextInt();
                }
               p+=a[0]+((a[2]/100.0)*a[0]);
                q+=p+((a[2]/100.0)*p);
                r+=q*a[1];
            }
            System.out.println(r);
            t--;
        }
    }
}
