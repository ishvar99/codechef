package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class Cheapest_Sub_Array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = t; i > 0; i--) {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int k = 0; k < a.length; k++) {
                a[k] = s.nextInt();
            }
            int check = a[0] + a[1];
            for (int k = 1; k < a.length - 1; k++) {
                if (check > a[k] + a[k + 1]) {
                    check = a[k] + a[k + 1];
                }
            }
            System.out.println(check);
        }
    }
}