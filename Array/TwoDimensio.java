import java.util.*;
public class TwoDimensio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 6;
        int m = 6;
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){ 
            arr[i][j] = sc.nextInt();
        }
    }
    /* for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
             System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }*/
    
int maxsum = Integer.MIN_VALUE;

  for(int j=0;j<=m-3;j++){
    for(int i=0;i<=n-3;i++){
    int sum =arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    if(sum>maxsum){
        maxsum=sum;
    }
    }
  }
System.out.println(maxsum);
 
    }
}

