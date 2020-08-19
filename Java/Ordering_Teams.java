package CODECHEF_BEGINNERS;
import java.util.Scanner;
 class Ordering_Teams
{
    public static boolean check_order(int a[][]) {
        int count=0;
        if(a[0][0] == a[1][0] && a[0][1] == a[1][1] && a[0][2] == a[1][2]){
            count++;
        }
        else if(a[0][0]==a[2][0] && a[0][1]==a[2][1] && a[0][2]==a[2][2]){
            count++;
        }
        else if(a[1][0]==a[2][0] && a[1][1]==a[2][1] && a[1][2]==a[2][2]){
            count++;
        }
        if(count !=0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[][]=new int[50][50];
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    a[j][k]=s.nextInt();
                }
            }
            if(check_order(a)){
                System.out.print("yes");
            }
            else{
                System.out.print("no");
            }
        }
    }
}
