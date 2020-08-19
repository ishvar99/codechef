package CODECHEF_BEGINNERS;
import java.util.Scanner;
class ZUBREACH {
    public static void safety(int t,int N,int M,int fx,int fy,int moves,char a[]) {
        int posX=0,posY=0;
    for(int i=0;i<moves;i++){
        if(a[i]=='U'){
           posY++;
        }
        else if(a[i]=='D'){
            posY--;
        }
        else if(a[i]=='R'){
            posX++;
        }
        else if(a[i]=='L'){
            posX--;
        }
    }
    if(posX==fx && posY==fy){
        System.out.println("Case "+(t+1)+": "+"REACHED");
    }
    else if(posX>M || posX<0 ||posY>N ||posY<0){
        System.out.println("Case "+(t+1)+": "+"DANGER");
    }
    else{
        System.out.println("Case "+(t+1)+": "+"SOMEWHERE");
    }
    }
    public static void main(String args[]){
        char a[]=new char[10000];
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int M=s.nextInt();
            int N=s.nextInt();
            int fx=s.nextInt();
            int fy=s.nextInt();
            int moves=s.nextInt();
            for(int j=0;j<moves;j++){
                a[j]=s.next().charAt(j);
            }
            safety(i,N,M,fx,fy,moves,a);
        }
    }
}
