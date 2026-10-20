import java.util.Scanner;

public class Search {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found=false;
        int arr[]= new int[n];
        System.out.println("Enter the value of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
System.out.println("Enter the desaire value:");
int d=sc.nextInt();
int index=-1;

for(int i=0;i<n;i++){
    if(arr[i]==d){
        found=true;
        index=i;
        break;

    }
}
System.out.println("Found the desaire value:"+found+" In the index:"+index);

    }
}
