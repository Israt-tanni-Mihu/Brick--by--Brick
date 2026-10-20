import java.util.*;
public class CopyArray {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    int copyarr[] = new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
     
    for(int i=0;i<n;i++){
        copyarr[i]=arr[i];
    }
     System.out.println("Original:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        
    }
    System.out.println(" ");
    System.out.println("Coppy array:");
    for(int i=0;i<n;i++){
       
        System.out.print(copyarr[i]+" ");
    }
    


 }   
}
