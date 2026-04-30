import java.util.*;
public class PassStrengthChecker {
        static void checkpass(String s){
            boolean checker=false;
            int digit=0,upper=0,lower=0,special=0;
            for(int i=0;i<s.length();i++){
                char ch =s.charAt(i);
                if(ch>='0' && ch<='9')
                    digit++;
                else if(ch>='A' && ch<='Z')
                    upper++;
                else if(ch>='a' && ch<='z')
                    lower++;
                else
                    special++;
            }
            if(digit>0 && upper>0 && lower>0 && special>0)
                System.out.println("strong password");
            checker=true;
            if(checker){
                System.out.println("success");
            }
            else{
                System.out.println("weak password");
            }
              }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the password:");
        String s =sc.next();
        checkpass(s);

        
      }
    }


