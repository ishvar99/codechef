package CODECHEF_BEGINNERS;

import java.util.Scanner;

class STRCH_TEST {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            String str=s.next();
            String x=s.next();
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n+1;j++) {
                    if(str.substring(i,j).contains(x))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}

