import java.util.*;
class SumofArrary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++){
            sum+=arr[i];
         }
         float avg=sum/n;
         System.out.println("Sum of the array:"+sum+ ". Average of the arrary:"+avg);
    }
}