import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        StringBuilder sb= new StringBuilder(s);

        System.out.println(sb.length());

        for(int i=0;i<sb.length()/2;i++){
            int front= i;// 0 1 2
            int back= sb.length()-1-front;//5 4 3
            
            char frontchar= sb.charAt(front);
            System.out.println(frontchar);
            char backchar= sb.charAt(back);
            System.out.println(backchar);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
            
        }
        System.out.println(sb);
    }
}
