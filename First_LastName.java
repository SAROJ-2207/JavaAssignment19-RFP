import java.util.Scanner;

public class First_LastName {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your firstname and last name");
            String userName = sc.nextLine();
            String regularExpression = "^[A-Z][a-z]\\s[A-Z][a-z]{3,}$";
            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }

