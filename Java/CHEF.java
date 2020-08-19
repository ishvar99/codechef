package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class CHEF {
    public static void check(String s) {
        int count=0;
        int len = s.length();
        if(len>=4) {
            for(int i=0;i<s.length()-3;i++) {
                String s1 = s.substring(i, i + 4);
                if (s1.contains("c") && s1.contains("h") && s1.contains("e") && s1.contains("f")) {
                    count++;
                }
            }
        }
        if (count>0) {
            System.out.println("lovely " + count);
        } else {
            System.out.println("normal");
        }
    }
    public static void main(String args[]){
        String c;
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++) {
            c = s.next();
            check(c);
        }
    }
}
