package CODECHEF_BEGINNERS.COOK111B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MEDEL {
    public static int findMedian(int a,int b,int c){
        ArrayList<Integer>x=new ArrayList<Integer>();
        x.add(a);
        x.add(b);
        x.add(c);
        Collections.sort(x);
        return x.get(1);
    }
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(s.nextInt());
            }
            while(a.size()>=3){
               a.remove(new Integer(findMedian(a.get(0), a.get(1),a.get(2))));
            }
            for(int x:a)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}
