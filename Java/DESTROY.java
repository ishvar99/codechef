package CODECHEF_BEGINNERS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DESTROY
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int count=0;
            ArrayList<Integer>a=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a.add(s.nextInt());
            }
           Collections.sort(a);
            for(int i=0;i<a.size();i++) {
                count++;
                for (int j = i; j < a.size(); j++) {
                    if (a.get(i) != a.get(j)) {
                        a.remove(j);
                        break;
                    }
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
