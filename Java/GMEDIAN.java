package CODECHEF_BEGINNERS;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GMEDIAN
{
    static void printSubsequences(float arr[],int n)
    {
        ArrayList<Float> a=new ArrayList<>();
        double median;
        int count=0;
        int opsize = (int)Math.pow(2, n);
        for (int counter = 1; counter < opsize; counter++) {
            for (int j = 0; j < n; j++) {
                if (BigInteger.valueOf(counter).testBit(j)) {
                   a.add(arr[j]);
                }
            }
            Collections.sort(a);
                if (a.size() % 2 == 0) {
               float mid= a.get((a.size()/2)-1);
               float mid1= a.get((a.size()/2));
               median=(mid+mid1)/2;
               if(a.contains((float)median)){
                        count++;
                    }
                }
                else
                    count++;
            a.clear();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            float arr[] = new float[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextFloat();
            }
            printSubsequences(arr, arr.length);
        }
    }
}
