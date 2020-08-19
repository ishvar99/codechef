package CODECHEF_BEGINNERS.COOK111B;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.math.BigInteger;
import java.util.Scanner;

public class CKWLK {
    public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     int t=s.nextInt();
     while(t-->0){
         BigInteger i=s.nextBigInteger();
         BigInteger ten=new BigInteger("10");
         BigInteger twenty=new BigInteger("20");
         int flag=0;
         for(int x=0;x<20;x++)
         {
             for(int y=0;y<20;y++)
             {
                 BigInteger j=ten.pow(x).multiply(twenty.pow(y));
                 if(i.equals(j))
                     flag=1;
             }
         }
         if(flag==1)
             System.out.println("Yes");
         else
             System.out.println("No");
     }
     }
    }
