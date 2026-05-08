
import java.util.HashSet;
import java.util.Scanner;g
public class HashSetOpreation {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int ele =sc.nextInt();
        while (ele!=0) {
            set.add(ele);
            ele=sc.nextInt();
            
        }
        for (int i : set) {
            System.out.println(i);
        }
    }   
}
