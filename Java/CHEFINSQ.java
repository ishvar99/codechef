package CODECHEF_BEGINNERS;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class CHEFINSQ {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            int count=1;
            int min=1000000000;
            int size = (int) Math.pow(2, n);
            for (int c = 1; c < size; c++) {
                int sum=0;
                if (Integer.bitCount(c) != k) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    if (BigInteger.valueOf(c).testBit(j)) {
                      sum+=a[j];
                    }
                }
                if(sum<min){
                    min=sum;
                    count=1;
                }
                else if(min==sum)
                    count++;

            }
            System.out.println(count);
        }
    }
}
