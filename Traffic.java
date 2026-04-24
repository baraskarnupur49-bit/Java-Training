import java.util.Scanner;

public class Traffic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed of the vehicles:");
        int speed=sc.nextInt();
        int fine=0;

        sc.nextLine();
        String repeated=sc.nextLine();

        if(speed>80){
           fine=500;
        }
        else if(speed>100){
            fine=1000;
        }
        if(repeated.equalsIgnoreCase("yes")){
            fine=fine*2;
        }
        System.out.println("fine="+fine);
        //sc.close();
    }
}


