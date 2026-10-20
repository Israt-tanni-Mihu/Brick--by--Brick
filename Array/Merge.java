import java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int arrmerge[] = new int[n+m];
    System.out.println("Enter first array value:");
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
            
        }
    System.out.println("Enter second array value:");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
System.out.println("TWO ARRAYS ARE:");
System.out.println("First array value:");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
System.out.println("Second array value:");
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }

        for(int i=0;i<n;i++){
            arrmerge[i] = arr1[i];
        }
        for(int i=n;i<n+m;i++){
            arrmerge[i]=arr2[i-n];
        }
        System.out.println();
        System.out.println("Merge array value:");
        for(int i=0;i<n+m;i++){
            System.out.print(arrmerge[i]+" ");
        }

    }
    
}
