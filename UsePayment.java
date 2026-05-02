import java.util.*;

interface UPI{
    default void payment() {
        System.out.println("Payment done using UPI");
    }
}

interface CreditCard{
     default void payment(){
     System.out.println("Payment done using CraditCard");
}
}
 interface DebitCard{
        default  void payment(){
           System.out.println("Payment done using DebitCard");
 }
}


 class Payment implements UPI,CreditCard,DebitCard{
      public void payment(){
        System.out.println("choose your payment method:");
        System.out.println("1. UPI");
        System.out.println("2. CreditCard");
        System.out.println("3. DebitCard");
      }

      public void upiPayment(){
        UPI.super.payment();
      }

      public void craditcardPayment(){
         CreditCard.super.payment();
      }

      public void debitcardPayment(){
        DebitCard.super.payment();
      }
 }

public class UsePayment {
    public static void main(String[] args){
        Payment p=new Payment();
        Scanner sc=new Scanner(System.in);
        p.payment();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                p.upiPayment();
                break;
                case 2:
                p.craditcardPayment();
                break;
                case 3:
                p.debitcardPayment();
                break;
                default:
      
            }
    }
}
