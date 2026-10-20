import java.util.ArrayList;
import java.util.Scanner;

public class Search {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    ArrayList<Integer>nums= new ArrayList<>();

    for(int i=0;i<8;i++){
        nums.add(sc.nextInt());
    }
    System.out.println("Enter the value");
    int SearchValue= sc.nextInt();

    for(int i=0;i<nums.size();i++){
        if(nums.get(i)==SearchValue){
            System.out.println(i);
        }
    }
   } 
}
