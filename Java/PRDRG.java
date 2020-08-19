package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class PRDRG {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int  t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int x=1,y;
            if(n==1|| n==2){
                x=1;
            }
            else {
                for (int i = 2; i < n; i++) {
                    y = (int) Math.pow(2, i);
                    x = y - x;
                }
            }
            System.out.print(x+" "+(int)Math.pow(2, n)+" ");
        }
    }
}
