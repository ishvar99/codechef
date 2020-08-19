package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class COUPSYS
{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int max1=0,max2=0,max3=0;
            int c1=0,c2=0,c3=0;
            int n=s.nextInt();
            int a[]=new int[3];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<3;j++)
                {
                    a[j] = s.nextInt();
                }
                if(a[1]==1 && max1<=a[2])
                {
                    if(max1==a[2])
                    {
                        if(c1>a[0]) {
                            c1 = a[0];
                        }
                    }
                    else {
                        max1 = a[2];
                        c1 = a[0];
                    }
                }
                else if(a[1]==2 && max2<=a[2])
                {
                    if(max2==a[2]) {
                        if (c2 > a[0]) {
                            c2 = a[0];
                        }
                    }
                    else {
                        max2 = a[2];
                        c2 = a[0];
                    }
                }
                else if(a[1]==3 && max3<=a[2]){
                    if(max3==a[2])
                    {
                     if(c3>a[0]) {
                         c3 = a[0];
                     }
                    }
                    else {
                        max3 = a[2];
                        c3 = a[0];
                    }
                }
            }
            System.out.println(max1+" "+c1);
            System.out.println(max2+" "+c2);
            System.out.println(max3+" "+c3);
            t--;
        }
    }
}
