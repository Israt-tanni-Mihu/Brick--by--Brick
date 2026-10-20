
import java.util.*;
 public class Hack1{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int count=0;
        boolean graphical=false;
                for(int i=0;i<A.length();i++){
            count++;
           
        }
        
        for(int j=0;j<B.length();j++){
            count++;
            
        }

        System.out.println(count);
         if (A.compareTo(B) > 0) {
          System.out.println("Yes");
          } else {
          System.out.println("No");
          }

          System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1)+ " "+Character.toUpperCase(B.charAt(0)) + B.substring(1));

        }
        
        
        }
       
    



 
    

