import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int size = n;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {

                    // Shift elements to the left
                    for (int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    // One element has been removed
                    size--;

                    // Check the same position again
                    j--;
                }
            }
        }

        System.out.println("After removing duplicates:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}