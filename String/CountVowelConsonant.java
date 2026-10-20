import java.util.*;

public class CountVowelConsonant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Take input:");
        String s= sc.nextLine();

        int even=0;
        int odd=0;

        for(int i=0;i<s.length();i++){
         if(s.charAt(i) == 'a' || s.charAt(i) == 'A'
         || s.charAt(i) == 'e' || s.charAt(i) == 'E'
        || s.charAt(i) == 'i' || s.charAt(i) == 'I'
        || s.charAt(i) == 'o' || s.charAt(i) == 'O'
        || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
          even++;

        }else{
            odd++;
        }
     }
     System.out.println("Even number in the string is:"+even);
     System.out.println("Odd number in the string is:"+odd);   
   }
}

