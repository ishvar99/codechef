package CODECHEF_BEGINNERS;
import java.util.Scanner;
class BITOBYT {
     public static void main(String args[]){
         long b,n,y,c;
         Scanner s=new Scanner(System.in);
         int t=s.nextInt();
         while(t-->0){
             b=0;
             n=0;
             y=0;
             c=0;
             int k=s.nextInt();
             c=(long)Math.pow(2,(int)(k-1)/26);
             if(((k-1)%26)>=0&&((k-1)%26)<2){
                b=c;
             }
             else if(((k-1)%26)>=2&&((k-1)%26)<10){
                 n=c;
             }
             else {
                 y=c;
             }
             System.out.println(b+" "+n+" "+y);
         }
     }
}
