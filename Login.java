import java.util.*;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        String password = "admin"; // correct password

        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(password)) {
                System.out.println("Login Successful");
                return;
            } else {
                attempts++;
            }
        }

        System.out.println("Account Locked");
    }
}