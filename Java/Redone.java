package CODECHEF_BEGINNERS;
import java.util.ArrayList;
import java.util.Scanner;
class Redone {
    static long sum;
    static long reduce(long x,long y){
        int m=1000000007;
                long k=((x+y)+(x*y))%m;
                sum+=k+(sum*k);
                return sum;
    }
    public static void main(String args[]){
        int t,n;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while(t-->0){
            sum=0;
            n=s.nextInt();
            ArrayList<Long>a=new ArrayList<>();
            for(int i=1;i<=n;i++){
                a.add((long)i);
            }
            long x=0;
            for(int i=0,j=n-1;i<n && j>0;i++,j--){
                if(i<j)
                 x=reduce(a.get(i),a.get(j));
                else if(i==j)
                    x=reduce(a.get(i), 0);
            }
            System.out.println(x);
        }
    }
}
