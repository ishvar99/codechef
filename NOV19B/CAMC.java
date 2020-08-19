package CODECHEF_BEGINNERS.NOV19B;

import java.util.*;
import java.util.stream.Collectors;

class CAMC {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int a[] = new int[n];
            Map<Integer,Integer>hm=new TreeMap<>();
            for (int i = 0; i < n; i++) {
                a[i]=s.nextInt();
                hm.put(a[i],i%m);
            }
            ArrayList<Integer> ar=new ArrayList<>();
            for(int i=0;i<n;i++){

                ar.add(a[i]);
            }
        }

    }
}