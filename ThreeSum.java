import java.util.*;
import java.util.Arrays;

public class ThreeSum {
public static void main(String[] args) {
    int[] nums={-1,0,1,2,-1,-4};
        Arrays.sort(nums); 
        List<List<Integer>> lst= new ArrayList<>();  
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
            continue;
             int l=i+1;
             int r=nums.length-1;
            int sum=0;
            while(l<r){
                sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                   lst.add(Arrays.asList(nums[i],nums[l],nums[r]));
                   l++;
                   r--;
                   while(l<r && nums[l]==nums[l-1]) 
                    l++;
                
                while(l<r && nums[r]==nums[r+1]) 
                    r--;
                
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;    
                }
                

            }
        }
        System.out.println(lst);
    }
}