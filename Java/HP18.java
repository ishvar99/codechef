package CODECHEF_BEGINNERS;
import java.util.ArrayList;
import java.util.Scanner;
class HP18{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0) {
            int a, b, n,count=0,count1=0;
            n = s.nextInt();
            a = s.nextInt();
            b = s.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(s.nextInt());
                if(arr.get(i)%a==0)
                    count++;
                else if(arr.get(i)%b==0)
                    count1++;
            }
            if(count>count1)
                System.out.println("BOB");
            else
                System.out.println("ALICE");
        }
    }
}
