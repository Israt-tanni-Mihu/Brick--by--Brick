import java.util.Scanner;

public class SortedORnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the value of the array:");
        boolean sorted=true;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
     for(int i=0;i<n-1;i++){
    if(arr[i]>arr[i+1]){
    
        sorted=false;
        break;
    }
     }

     System.out.println("Array is sorted: "+sorted);


    }
}
