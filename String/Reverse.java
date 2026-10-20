import java.util.*;
public class Reverse {
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Take the actual string:");
String normal = sc.nextLine();

for(int i=normal.length()-1;i>=0;i--){
    System.out.print(normal.charAt(i));


}

    }
    
}
