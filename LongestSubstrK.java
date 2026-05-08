public class LongestSubstrK {
    public static void  main(String[] args){
        int [] arr={1,2,1,0,1,1,0,1};
        int k=4;
        int l=0,sum=0,max=0;

        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum<=k && max<r-1+l ){
                max=r-l+1;
            }
        }
        System.out.println(max);
    }
}
