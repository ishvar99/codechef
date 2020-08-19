package CODECHEF_BEGINNERS;

import java.util.Arrays;
import java.util.Scanner;

class STRCH {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            String str=s.next();
            char x=s.next().charAt(0);
            int count=0;
            int pos=-1;
            for(int i=0;i<n;i++){
                if(str.charAt(i)==x){
                    count+=i+1;
                    pos=i;
                }
                else{
                    count+=pos+1;
                }
            }
       System.out.println(count);
        }
    }
}
