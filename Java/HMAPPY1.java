package CODECHEF_BEGINNERS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class HMAPPY1 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        int k=s.nextInt();
        ArrayList a=new ArrayList();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        String str=s.next();
        for(int i=0;i<q;i++)
        {
            int count=0,result=0;
            if(str.charAt(i)=='!')
            {
                 for(int j=n-1;j>0;j--){
                     Collections.swap(a, j, j-1);
                 }
            }
            else {
                for (int j = 0; j < n; j++)
                {
                    if (a.get(j).equals(0))
                        count = 0;
                    else
                    {
                        count++;
                        result = Math.max(result, count);
                    }
                }
                if(result>k)
                    System.out.println(k);
                else
                    System.out.println(result);
            }
        }
    }
}
