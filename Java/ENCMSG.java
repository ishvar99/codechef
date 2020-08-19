package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class ENCMSG {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            StringBuilder str=new StringBuilder(s.next());
            for(int i=0;i<n-1;i+=2){
                char temp=str.charAt(i);
                str.setCharAt(i, str.charAt(i+1));
                str.setCharAt(i+1, temp);
                }
                for(int i=0;i<n;i++){
                   str.setCharAt(i, (char)(219-str.charAt(i)));
                   }
                   System.out.println(str);
        }
    }
}
