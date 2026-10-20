import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Take input:");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            boolean appearedBefore = false;

            // Count how many times the character appears
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            // Check whether this character appeared before
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == s.charAt(i)) {
                    appearedBefore = true;
                    break;
                }
            }

            // Print only the first occurrence
            if (!appearedBefore) {
                System.out.println(s.charAt(i) + " appears in the string: " + count + " times.");
            }
        }
    }
}