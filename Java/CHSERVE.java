package CODECHEF_BEGINNERS;

import java.util.Scanner;

class CHSERVE {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int p1=s.nextInt();
            int p2=s.nextInt();
            int k=s.nextInt();
            if(((p1+p2)/k)%2==0) {
                System.out.println("CHEF");
            }else {
                System.out.println("COOK");
            }
        }
    }
}
