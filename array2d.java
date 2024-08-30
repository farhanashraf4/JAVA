import java.util.*;
public class array2d {
    
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the rows of the array: ");
        int row= sc.nextInt();
        System.out.println("Enter the size of the columns of the array: ");
        int col= sc.nextInt();
        int array[][]= new int[row][col];

        System.out.println("Enter no.s in array[]: ");
        for(int i=0; i<row;i++){ // storing rows in array

            for(int j=0;j<col;j++){ // storing columns in array
                
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your array is here: ");
        for(int i=0; i<row;i++){ 
            for(int j=0;j<col;j++){ 
                
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Enter no. of array to search index:");
        int n=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]==n){
                    System.out.println("Index is= "+i+" "+j);
                }
            }
        }

    
    }
}
