import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Take input:");
        String original = sc.nextLine();

          String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse = reverse + original.charAt(i);   
        }

        if(original.equals(reverse)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }

    }
}
