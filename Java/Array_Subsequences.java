package CODECHEF_BEGINNERS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Subsequences_1 {
    public static void printSubsequences(List<Integer> i, String o) {

        if (i.size() == 0) {
            if (!o.isEmpty()) {
                System.out.println(o);
            }
            return;
        }
        printSubsequences(i.subList(1, i.size()), o);
        printSubsequences(i.subList(1, i.size()), o + i.get(0));
    }
    public static void printSubsequences(List<Integer> i){
        printSubsequences(i, "");
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        printSubsequences(a);
    }
}

