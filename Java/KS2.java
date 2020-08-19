package CODECHEF_BEGINNERS;
import java.util.HashMap;
import java.util.Scanner;
class KS2 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
            {
                a[i]=s.nextInt();
            }
            long ans = 0;
            int[] xorArr = new int[n+1];
            HashMap<Integer,Integer> mp=new HashMap<>();
            xorArr[1] = a[1];
            int index=0;
            for (int i = 2; i <= n; i++)
                xorArr[i] = xorArr[i - 1] ^ a[i];
            for (int i = 1; i <= n; i++) {
                int tmp = xorArr[i];
                if(mp.get(tmp)!=null){
                    mp.put(xorArr[i], i-mp.get(xorArr[i]));
                  ans+=mp.get(tmp)-1;
                }
                if (xorArr[i] == 0)
                    ans+=i-1;
                Integer count=mp.get(xorArr[i]);

                if(count==null) {
                    mp.put(xorArr[i], i);
                }
            }
            System.out.println(ans);
        }
    }

}