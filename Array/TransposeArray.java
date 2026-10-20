import java.util.Scanner;
public class TransposeArray {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int sum =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int arr1[][]= new int[m][n];
            for(int j=0;j<m;j++){
                for(int i=0;i<n;i++){
                 
                    arr1[j][i]=arr[i][j];
                    }
            }
        
System.out.println("After transpose:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
         


    }
}
    