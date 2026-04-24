import java.util.*;

public class Login {
    public static void main(String[] args) {
        // Login logic here
       Scanner sc= new Scanner(System.in);
       int attempts=0;
       String password="admin";


       while(attempts<3){
        System.out.println("Enter password:");
        String input=sc.nextLine();

        if (input.equals(password)) {
            
        }
       }
      

        
    }
}
