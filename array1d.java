import java.util.*;
public class array1d {
    
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int array[]= new int[size];

        System.out.println("Enter no.s in array[]: ");
        for(int i=0; i<size;i++){ // storing number in array
            array[i]=sc.nextInt();
        }
        System.out.println("Your array is here: ");
        System.out.print("[");
        for(int i=0;i<size;i++){ // PRINTING ARRAY
            System.out.print(array[i]+" ");
        }
        System.out.print("]");

        System.out.println("");
        System.out.println("Enter a array no.: ");
        int n=sc.nextInt();

        for(int i=0; i<size;i++){
            
            if(array[i]==n){
                System.out.println("No. found at index= "+i);
            }
        }
    }
}
