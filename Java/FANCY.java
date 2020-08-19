package CODECHEF_BEGINNERS;
import java.util.Arrays;
import java.util.Scanner;
class FANCY {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        while (t-- > 0) {
            int flag=0;
            StringBuilder str=new StringBuilder(s.next());
            s.nextLine();
            StringBuilder str1=new StringBuilder();
            str.append(" ");
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=' '){
                    str1.append(str.charAt(i));
                }
                else {
                    if(str1.equals("not")){
                        flag=1;
                        break;
                    }
                    str1.setLength(0);
                }
            }
             if(flag==1){
                System.out.println("Real Fancy");
            }
            else
                System.out.println("regularly fancy");
        }
    }
}
