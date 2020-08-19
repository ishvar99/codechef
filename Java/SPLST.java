package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class SPLST
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int x=s.nextInt();
            int y=s.nextInt();
            if((x-a)+(y-b)==c ||(x-b)+(y-c)==a ||(x-a)+(y-c)==b){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
