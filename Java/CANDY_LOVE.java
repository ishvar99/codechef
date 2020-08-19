package CODECHEF_BEGINNERS;
import java.util.Scanner;
class CANDY_LOVE {
    public static void main(String args[]) {
        int a[] = new int[1000];
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int sum=0;
            int n = s.nextInt();
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
                sum += a[j];
            }
            if ((sum%n)!=0) System.out.print("YES");
            else System.out.print("NO");
        }
    }
}
