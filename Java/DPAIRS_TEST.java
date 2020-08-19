package CODECHEF_BEGINNERS;
import java.util.HashMap;
import java.util.Scanner;
class DPAIRS_TEST
{
 public static void main(String args[])
 {
     Scanner s =new Scanner(System.in);
     int n=s.nextInt();
     int m=s.nextInt();
     int a[]=new int[n];
     int b[]=new int[m];
     HashMap<Integer, Integer> pair = new HashMap<>();
     for (int i = 0; i < n; i ++) {
         a[i]=s.nextInt();
         pair.put(a[i], i);
     }
     for (int j = 0; j < m; j ++)
     {
         b[j]=s.nextInt();
         if(pair.containsKey(b[j]))
         {
             System.out.println(pair.get(b[j])+" "+j);
         }
     }
 }
}

