import java.util.*;

public class WearHouse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       
        int n =sc.nextInt();
        System.out.println("Total number of Products");
        int total=0;
        
       for(int i=1;i<n;i++){
        int curr=sc.nextInt();
        int minreq=sc.nextInt();
        
        if(curr<minreq){
            System.out.println("Restock needed for product:"+i);
        total++;
        }
       }
       System.out.println("Total no of product need to be restock"+total);
    }
}
