package CODECHEF_BEGINNERS.OCT19B;

import java.util.Scanner;

class S10E {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=s.nextInt();
            }
            int count=0;
            for(int i=2;i<=n;i++){
                if(i==2)
                    if(a[i]<a[i-1])
                        count++;

                    if(i==3)
                        if(a[i]<a[i-1] && a[i]<a[i-2])
                            count++;
                    if(i==4)
                        if(a[i]<a[i-1] && a[i]<a[i-2] &&a[i]<a[i-3])
                            count++;
                    if(i==5)
                        if(a[i]<a[i-1]&&a[i]<a[i-2]&&a[i]<a[i-3] &&a[i]<a[i-4])
                            count++;
                    if(i>5) {
                        if (a[i] < a[i - 1] && a[i] < a[i - 2] && a[i] < a[i - 3] && a[i] < a[i - 4] && a[i] < a[i - 5])
                            count++;
                    }
            }
            System.out.println(count+1);
        }
    }
}
