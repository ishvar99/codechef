package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class CHEF_FRIENDS {
    public static int count=0;
    public static void Check_Friend(String s){
        for(int i=0;i<s.length()-3;i++){
            String s1=s.substring(i,i+2),s2=s.substring(i,i+3),s3=s.substring(i,i+4);
            if((s1.contains("ch")||s1.contains("he")||s1.contains("ef")||(s2.contains("che")||s2.contains("hef")||(s3.contains("chef"))))){
                 count++;
                 break;
            }
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            String c=s.next();
            Check_Friend(c);
        }
        System.out.println(count);
    }
}
