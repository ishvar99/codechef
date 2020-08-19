package CODECHEF_BEGINNERS;
import java.util.*;
class MISSP
{
    public static void main(String[] args)
    {
        int t,n,i;
        Scanner input=new Scanner(System.in);
        t=input.nextInt();
        while(t-->0)
        {
            n=input.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=input.nextInt();
            }
            Arrays.sort(a);
            for(i=0;i<n-1;i=i+2)
            {
                if(a[i]!=a[i+1])
                {
                    //System.out.println(a[i]);
                    break;
                }
            }
            System.out.println(a[i]);
        }
    }

}