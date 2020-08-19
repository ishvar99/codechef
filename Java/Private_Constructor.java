package CODECHEF_BEGINNERS;
import java.util.Scanner;

public class Private_Constructor {
    static Scanner s;
    static Private_Constructor obj=null;
    int age;
    String name;
    private Private_Constructor(int age,String name) {
        //Prevents class from being directly instantiated
        this.age=age;
        this.name=name;
    }
    public static Private_Constructor Private_ConstructorObject(){
        s=new Scanner(System.in);
        int a=s.nextInt();
        String n=s.next();
         obj=new Private_Constructor(a,n);
        return obj;
    }
    public String toString(){
     return String.format("Hello My name is %s and my age is %d yrs.",name,age);
    }
    public void display() {
        System.out.println(obj.toString());
    }

}
class Main {
    public static void main(String args[]) {
       // Private_Constructor p = new Private_Constructor();
        // This statement will give error as constructor is private
        // and class cannot be directly instantiated
        Private_Constructor obj= Private_Constructor.Private_ConstructorObject();
        obj.display();
    }
}
