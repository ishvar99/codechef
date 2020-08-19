package CODECHEF_BEGINNERS;
import java.math.BigInteger;
import java.util.Scanner;
class FIBEASY {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        long f[] = new long[61];
        f[1] = 0;
        f[2]=1;
        for (int i=3; i<=60; i++)
        {
            f[i] = f[i-1] + f[i-2];
            f[i]%=10;
        }
        while (t-->0) {
            BigInteger n = s.nextBigInteger();
//           BigInteger k= x.mod(new BigInteger("60"));
//                System.out.println(k.intValue());
        }
    }
}
