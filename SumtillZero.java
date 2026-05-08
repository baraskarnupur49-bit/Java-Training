import java.util.*;

public class SumtillZero {
    public static void main(String[] args){
    ArrayList<Integer> lst=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int ele=sc.nextInt();
    while (ele!=0) {
        lst.add(ele);
        ele=sc.nextInt();
        
    }
    System.err.println("printing...............");
    for (int i : lst) {
        System.out.println(i);
    }
}
}
