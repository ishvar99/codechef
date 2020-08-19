package CODECHEF_BEGINNERS;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;
class DPAIRS {
 public static void main(String args[])
 {
     Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int m=s.nextInt();
  int a[]=new int[n];
  int b[]=new int[m];
  ArrayList<Integer>x=new ArrayList<>();
  for(int i=0;i<n;i++)
  {
      a[i]=s.nextInt();
  }
  for(int j=0;j<m;j++){
      b[j]=s.nextInt();
  }
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<m;j--)
      {
          if(x.size()==m+n-1)
              exit(0);
         if(x.isEmpty()||!x.contains(a[i]+b[j]))
         {
             x.add(a[i]+b[j]);
             System.out.println(i+" "+j);
         }
      }
  }
 }
}
