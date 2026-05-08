import java.util.*;

public class CinemaBooking {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int n=9;
    int[] arr=new int[9];
  
    
    for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
    }
     int max=0,c=0;
     for(int i=0;i<n;i++){
        if(arr[i]==0)
            c++;
        else if(c!=0){
            max=max<c?c:max;
            c=0;
        }
} 
max=max<c?c:max;
System.out.println(max);
}
    
}
