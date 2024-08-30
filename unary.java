import java.util.Scanner;

public class unary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=sc.nextInt();
        int a=++n;
        System.out.println(a);
        int b=5+a;
        System.out.println(b);
    }
    
}
