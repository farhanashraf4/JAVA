import java.util.*;
public class switchcase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        char button;
        button = sc.next().charAt(0);
        a = sc.nextInt();
        b = sc.nextInt();

        switch (button) {
            case '+':
            int s=a+b;
            System.out.println("Sum = "+s);
            break;
            case '-':
            int d=a-b;
            System.out.println("Difference = "+d);
            break;
            case '/':
            int divison=a/b;
            System.out.println("Divison = "+divison);
            break;
            case '%':
            int remainder=a%b;
            System.out.println("remainder = "+remainder);
            break;
            case '*':
            int m=a*b;
            System.out.println("Multiplication = "+m);
            break;
            default:System.out.println("Invalid choice!");
                break;
            
        }
    }
}