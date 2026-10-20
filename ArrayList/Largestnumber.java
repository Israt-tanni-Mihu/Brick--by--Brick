import java.util.*;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> largest = new ArrayList<>();
        
        for(int i=0;i<7;i++){
            largest.add(sc.nextInt());
        }
       
      /*   int max=largest.get(0);
        for(int i=0;i<largest.size();i++){
            if(largest.get(i)>max){
                max=largest.get(i);
            }
        }
        System.out.println("Largest number is: "+max);*/



        int min=largest.get(0);
        for(int i=0;i<largest.size();i++){
            if(largest.get(i)<min){
                min=largest.get(i);
            }
        }
        System.out.println("Lowest number is: "+min);
    }
}
