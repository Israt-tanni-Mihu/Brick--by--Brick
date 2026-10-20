import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        // Take 7 numbers
        for (int i = 0; i < 7; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println("Enter the value:");
        int searchValue = sc.nextInt();

        boolean found = false;

        // Search and remove first occurrence
        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) == searchValue) {
                nums.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found!");
        }

        System.out.println("Updated ArrayList: " + nums);

        sc.close();
    }
}