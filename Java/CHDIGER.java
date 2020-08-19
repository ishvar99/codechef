package CODECHEF_BEGINNERS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class CHDIGER
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            String n=s.next();
            String d=s.next();
            String f=n.concat(d);
            ArrayList<Integer>a=new ArrayList<>();
            for(int i=0;i<f.length();i++){
                int x=f.charAt(i)-'0';
                a.add(x);
            }
            a.remove(Collections.max(a));
            for(int i=0;i<a.size();i++){
                System.out.print(a.get(i));
            }
        }
    }
}
