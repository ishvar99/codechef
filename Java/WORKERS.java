package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class WORKERS {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        int a[]=new int[w];
        int b[]=new int[w];
        for(int i=0;i<w;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<w;i++)
        {
            b[i]=s.nextInt();
        }
        int min=99999999,min1=99999999,min2=99999999;
       for(int i=0;i<w;i++){
            if(b[i]==1 && a[i]<min){
                min=a[i];
            }
            else if(b[i]==2 && a[i]<min1){
                min1=a[i];
            }
            else if(b[i]==3 && a[i]<min2)
            {
              min2=a[i];
            }
       }
        if(min+min1<min2){
            System.out.println(min+min1);
        }
        else
        {
            System.out.println(min2);
        }
    }
}
