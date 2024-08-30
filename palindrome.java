import java.util.*;
class Palindrome {
    public static boolean isPalindrome(int x) {
        int orignalN= x;
        int reverseN= 0;

        while(x!= 0){

            int remainder= x%10;
            reverseN= reverseN*10+remainder;
            x= x/10;
        }
        
        return orignalN==reverseN;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an no. to check palindrome:");
        int x= sc.nextInt();

        if(isPalindrome(x)){
            System.out.println(x+"   is Palindrome");
        }
        else{
            System.out.println(x+"   is not Palindrome");
        }
    }
}