import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Take input:");
        String s = sc.nextLine();
        String p="";

        for (int i = 0; i < s.length(); i++) {
             
             boolean appeared = false;

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    appeared = true;
                }
            }
            if(!appeared){
                p=p+s.charAt(i);
            }
                
            }
             System.out.println(p);
             sc.close();
        }
       
    }


