package CODECHEF_BEGINNERS;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Pair
{
    // Return a map entry (key-value pair) from the specified values
    public static <T, U> Map.Entry<T, U> of(T first, U second)
    {
        return new AbstractMap.SimpleEntry<>(first, second);
    }
}
class FENCE {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int r=s.nextInt();
            int c=s.nextInt();
            int k=s.nextInt();
            HashMap<Map.Entry<Integer,Integer>,Integer> x=new HashMap<>();
            for(int i=0;i<k;i++){
                int pr=s.nextInt();
                int pc=s.nextInt();
                x.put(Pair.of(pr,pc),1);
            }
            int count=0;
            for(int i=1;i<=r;i++){
                for(int j=1;j<=c;j++){
                    x.putIfAbsent(Pair.of(i, j), 0);
                    x.putIfAbsent(Pair.of(i-1, j), 0);
                    x.putIfAbsent(Pair.of(i+1, j), 0);
                    x.putIfAbsent(Pair.of(i, j-1), 0);
                    x.putIfAbsent(Pair.of(i, j+1), 0);
                    if(x.get(Pair.of(i,j))==1){
                        if(x.get(Pair.of(i-1,j))==1 && x.get(Pair.of(i+1,j))==1){
                            if(x.get(Pair.of(i,j-1))!=1 && x.get(Pair.of(i,j+1))!=1){
                                count+=2;
                            }
                            else if(x.get(Pair.of(i,j-1))==1 && x.get(Pair.of(i,j+1))==1){
                                count+=0;
                            }
                            else{
                                count+=1;
                            }
                        }
                        else if(x.get(Pair.of(i-1,j))!=1 && x.get(Pair.of(i+1,j))!=1){
                            if(x.get(Pair.of(i,j-1))!=1 && x.get(Pair.of(i,j+1))!=1){
                                count+=4;
                            }
                            else if(x.get(Pair.of(i,j-1))==1 && x.get(Pair.of(i,j+1))==1){
                                count+=2;
                            }
                            else{
                                count+=3;
                            }
                        }
                        else{
                            if(x.get(Pair.of(i,j-1))!=1 &&x.get(Pair.of(i,j+1))!=1){
                                count+=3;
                            }
                            else if(x.get(Pair.of(i,j-1))==1 && x.get(Pair.of(i,j+1))==1){
                                count+=1;
                            }
                            else{
                                count+=2;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
