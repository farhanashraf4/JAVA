import java.util.*;
import java.io.*;
public class functionexample {
    public static int add(int a, int b){
        int s=a+b;
        return s;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.s: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int s=add(a,b);

        System.out.println("Sum= "+s);
    }
}
