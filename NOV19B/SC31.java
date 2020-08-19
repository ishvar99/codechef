package CODECHEF_BEGINNERS.NOV19B;

import java.util.Scanner;

class SC31 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            String str[]=new String[n];
            for(int i=0;i<n;i++){
                str[i]=s.next();
            }
            int sum=0;
            for(int i=0;i<10;i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (str[j].charAt(i) == '1') {
                        count++;
                    }
                }
                if (count%2!=0)
                    sum++;
            }
            System.out.println(sum);
        }
    }
}
