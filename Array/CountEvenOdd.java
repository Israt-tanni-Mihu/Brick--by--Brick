import java.util.*;
public class CountEvenOdd{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int countEven=0;
        int countOdd=0;
        int arr[]= new int[n];

        //for take input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
                }

//
for(int i=0;i<n;i++){
    if(arr[i]%2==0){
        countEven++;
    }else{
        countOdd++;
    }
}

System.out.println("Number of even is:"+countEven+". Number of odd:"+countOdd);


}




}