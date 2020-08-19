package CODECHEF_BEGINNERS;
public class String_Subsequences {
    public static void printSubsequences(String in,String o){
        if(in.length()==0)
        {
            if(!o.isEmpty()) {
                System.out.println(o);
            }
            return;
        }
        printSubsequences(in.substring(1), o);
        printSubsequences(in.substring(1), o+in.charAt(0));
    }
    public static void printSubsequences(String in){
        printSubsequences(in, "");
    }
    public static void main(String args[]){
       printSubsequences("xyz");
    }
}
