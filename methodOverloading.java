import java.util.Scanner;

class methodoverloading{
    public int add(int a ,int b){
        return a+b;
    }
    public int add(int a ,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        methodoverloading sum= new methodoverloading();
        System.out.println("Input no.s:");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int sum1=sum.add(a,b,c);
        System.out.println(sum1);
        int sum2=sum.add(a,b);
        System.out.println(sum2);

    }
}