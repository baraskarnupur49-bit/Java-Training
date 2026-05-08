import java.util.HashMap;
import java.util.*;

public class LongestSubarrayKPrefix {
    public  static  void main(String[] args){
     int[] arr={1,2,3,-2,5,2};
     int k=6;
     int n=arr.length;
     HashMap<Integer,Integer> map = new HashMap<>();

     int max=0,l=0,sum=0;

     for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum==k && max<i+1){
            max=i+1;
        }
        if(sum-k==0 && max<i+1){
            max=i+1;
        }
        if(map.containsKey(sum-k)){
            max=max>(i-map.get(sum-k))?i-map.get(sum-k):max;
        }
        if(map.containsKey(sum)){
            map.put(sum,i);
        }
     }
    System.out.println(max);
    }
}
