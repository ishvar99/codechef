package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class MINDSUM {
    static int digSum(int n)
    {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
    public static void main(String args[]){
      Scanner s =new Scanner(System.in);
      int t=s.nextInt();
      while(t-->0){
          int min=0;
          int count=0;
          int n=s.nextInt();
          int d=s.nextInt();
          int a=digSum(n);
          int b=digSum(d);
          int c=digSum(a+b);
          if(n%9==0 && d%9==0){
              min=9;
              count=1;
              if(n==9){
                  count=0;
              }
          }
          else if(n%3==0&&d%3==0){
              min=3;
          }
      }
    }
}
