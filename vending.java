
import java.util.*;

public class vending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, trayNo;

        do {
            System.out.println("Tray1 | beverages");
            System.out.println("Tray2 | snacks");
            System.out.println("Tray3 | chocolates");

            System.out.println("select your tray by using(1/2/3/0(exit))");
            trayNo = sc.nextInt();

            switch (trayNo) {

                case 1: {
                    char stay;
                    do {
                        System.out.println("a. coca cola 30rs");
                        System.out.println("b. sprite 50rs");
                        System.out.println("c. mazza 60rs");

                        System.out.println("Item to purchase(a/b/c): ");
                        char prod = sc.next().charAt(0);

                        if (prod == 'a')
                            total += 30;
                        else if (prod == 'b')
                            total += 50;
                        else if (prod == 'c')
                            total += 60;

                        System.out.println("stay on same tray(y/n): ");
                        stay = sc.next().charAt(0);

                    } while (stay == 'y');  // FIXED
                    break;
                }

                case 2: {
                    char stay;
                    do {
                        System.out.println("a. Lays 30rs");
                        System.out.println("b. Balaji 50rs");
                        System.out.println("c. Haldiram 60rs");

                        System.out.println("Item to purchase(a/b/c): ");
                        char prod = sc.next().charAt(0);

                        if (prod == 'a')
                            total += 30;
                        else if (prod == 'b')
                            total += 50;
                        else if (prod == 'c')
                            total += 60;

                        System.out.println("stay on same tray(y/n): ");
                        stay = sc.next().charAt(0);

                    } while (stay == 'y');  // FIXED
                    break;
                }

                case 3: {
                    char stay;
                    do {
                        System.out.println("a. Kitkat 30rs");
                        System.out.println("b. Dairy milk 50rs");
                        System.out.println("c. Lotte choco pie 60rs");

                        System.out.println("Item to purchase(a/b/c): ");
                        char prod = sc.next().charAt(0);

                        if (prod == 'a')
                            total += 30;
                        else if (prod == 'b')
                            total += 50;
                        else if (prod == 'c')
                            total += 60;

                        System.out.println("stay on same tray(y/n): ");
                        stay = sc.next().charAt(0);

                    } while (stay == 'y');  // FIXED
                    break;
                }

                default:
                    break;
            }

        } while (trayNo != 0);  // FIXED variable name

        System.out.println("total bill will be: " + total);
    }
}