import java.util.*;
public class Input {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();

   System.out.println(s);

   for(int i=s.length();i>=0;i--){
System.out.print(s.charAt(i));
   }


    }
    
}
