package CODECHEF_BEGINNERS;
import java.util.Arrays;
import java.util.Scanner;

class CHHAPPY {
     public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         int t=s.nextInt();
         while (t-->0)
         {
             int n=s.nextInt();
             int a[]=new int[n+1];
             int b[]=new int[n+1];
             int count=1,count1=1;
             for(int i=1;i<=n;i++){
                 a[i]=s.nextInt();
             }
             for(int i=1;i<=n;i++){
                 b[i]=a[a[i]];
             }
             Arrays.sort(a);
             Arrays.sort(b);
             int check=a[1];
             int check1=b[1];
             for(int i=2;i<=n;i++)
             {
                 if(check!=a[i]){
                     count++;
                     check=a[i];
                 }
                 if(check1!=b[i]){
                     count1++;
                     check1=b[i];
                 }
             }
             if(count==count1){
                 System.out.println("Poor Chef");
             }
             else{
                 System.out.println("Truly Happy");
             }
         }
     }
}
