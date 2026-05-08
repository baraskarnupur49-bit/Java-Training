import java.util.Arrays;       int k=sc.nextInt();   
import java.util.Scanner;

public class SmartCity {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
       
    int [] arr= new int[]{4,8,15,3,10,12,5,9};
    int sum=0,max=0;
    for(int i=0;i<k;i++){
     sum+=arr[i];
    }
     max=max<sum?sum:max;
     for(int i=k;i<arr.length;i++){
        sum-=arr[i-k];
        sum+=arr[i];
        max=max<sum?sum:max;
     }
     System.out.println(max);
    } 
}
