import java.util.*;
public class Atm_machin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int balance = 5000;

        System.out.print("Enter your ATM Card: ");
        String Ram = sc.next();

        System.out.print("Enter your PIN: ");
        int userPin = sc.nextInt();
        if (userPin != pin) {
            System.out.println("Invalid PIN");
            sc.close();
            return;
        }

        System.out.print("Enter your Name: ");
        String Name = sc.next();

        System.out.println("Welcome " + Name);
        System.out.println("Please wait, do not remove the ATM card...");

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice: ");

        int cash = sc.nextInt();

        switch (cash) {
            case 1:
                System.out.println("Your Balance = Rs. " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();
                System.out.println("Thank you "+ Name);

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Deposit Successful");
                    System.out.println("Updated Balance = Rs. " + balance);
                } else {
                    System.out.println("Invalid Amount");
                }
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw <= 0) {
                    System.out.println("Invalid Amount");
                } else if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance = Rs. " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM!");
                break;

            default:
           System.out.println("Invalid Choice");
        }
    }
}