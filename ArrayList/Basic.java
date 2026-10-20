import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<Integer>();

        for(int i=0;i<5;i++){
            numbers.add(sc.nextInt());
        }
        int sum=0;
        for(int i=0;i<numbers.size();i++){
            sum=sum+numbers.get(i);
        }
        System.out.println("arraylist"+numbers);
        System.out.println("Total sum: "+sum);
        sc.close();
    }
}
