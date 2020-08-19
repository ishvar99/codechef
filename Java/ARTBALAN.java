package CODECHEF_BEGINNERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ARTBALAN {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String str;
        while(t-->0){
            str=s.next();
            char[]c=str.toCharArray();
            Arrays.sort(c);
            ArrayList<Integer>a=new ArrayList<>();
            int count=1;
            int len=c.length-1;
            for(int i=0;i<len;i++){
                if(c[i]==c[i+1]){
                    count++;
                    if(i!=len-1)
                    continue;
                }
                    a.add(count);
                    count=1;
            }
            Collections.sort(a);
        }
    }
}
