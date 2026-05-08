
public class LongestSubAEven {
    



    public static void main(String[] args) {
        int[] arr = {1,2,1,1,0,1,0,1};
        int sum=0,max=0,l=0,r=arr.length-1;//7

        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; // sum =7
        }
        if(sum%2==0){
            System.out.println(arr.length);
            return;
        }
            
        while(l<arr.length && arr[l]%2==0)
            l++; //l=0
        while(r>=0 && arr[r]%2==0)
            r--;//7

        max = arr.length-1-l>r?arr.length-l-1:r;
        System.out.println(max);
    }
}

