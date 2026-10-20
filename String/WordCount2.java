import java.util.*;
public class WordCount2 {
    

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
           
         System.out.println("Enter input:");
         String s = sc.nextLine();  
         int count=0;
         boolean inWord=false;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '&& inWord==false){
                inWord=true;
                count++;
            }
            if(s.charAt(i)==' '&& inWord==true){
                inWord=false;
               
            }
         }
         System.out.println("number of words is:"+count);
        
        }
}

