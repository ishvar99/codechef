package CODECHEF_BEGINNERS;
import java.math.BigInteger;
import java.util.Scanner;
class PINS {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        BigInteger q;
        while(t>0) {
            BigInteger r;
            q=new BigInteger("10");
            int n = s.nextInt();
            int p=1;
            if(n%2==0){
                r= q.pow(n-(((n-2)/2)+1));
            }
            else {
              r= q.pow(n-(((n-1)/2)+1));
            }
            System.out.println(p+" "+r);
            t--;
        }
    }
}
