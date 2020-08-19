package CODECHEF_BEGINNERS;
import java.util.Scanner;
public class Magical_Word {
    public static boolean func(char s){
        int flag=0;
        for(int i=2;i<=s/2;i++){
            if(s%i==0){
                flag=1;
            }
            if(flag==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
            int q=s.nextInt();
            StringBuilder str=new StringBuilder(s.nextLine());
            for(int j=0;j<q;j++){

            }
            System.out.println(str);
        }
    }

