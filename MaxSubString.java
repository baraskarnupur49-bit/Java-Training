import java.util.HashMap;
import java.util.Scanner;

public class MaxSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String str=sc.nextLine();
        int k=sc.nextInt();
        HashMap<Character,Integer> map = new HashMap<>();
       int l=0,max=0;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);//insertion operation
        while(map.size()>k){
        
            if(map.get(str.charAt(l))-1== 0) {
                map.remove(str.charAt(l));
                l++;
                continue;
            }
        
             map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
              l++;
            }
            if(max<i-l+1){
                max=i-l+1;
            }
        }
        System.out.println(max);
    }
}
