package CODECHEF_BEGINNERS;
import java.util.Scanner;
    class SINS {
    public static int method(int x,int y) {
        if(x==0)
            return y;
        else
            return method(y%x,x);
    }
    public static void main(String args[]) {
        int x, y, n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            x = s.nextInt();
            y = s.nextInt();
            System.out.println(2*method(x, y));
        }
    }
}
