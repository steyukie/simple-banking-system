import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Stefany Yukie";
        String accountType = "Saving";
        double balance = 1999.11;
        int option = 0;

        // PROFILE TEMPLATE
        String profile = ("""
                ====================================
                Welcome to the JavaBank, %s.
                ------------------------------------
                Name: %s
                Account type: %s
                Your balance: R$%.2f
                ====================================
                """. formatted(name, name, accountType, balance));

        // MAIN MENU
        String menu = ("""
                ======= MENU =======
                1) Check balance
                2) Deposit amount
                3) Transfer amount
                4) Exit
                
                Please, select an option:
                """);

        Scanner input = new Scanner(System.in);

        System.out.println(profile);

        while (option != 4) {
            System.out.println(menu);
            option = input.nextInt();

            // CHECK ACCOUNT BALANCE
            if (option == 1) {
                System.out.println(String.format("Your current balance is R$%.2f", balance));

            // DEPOSIT OPTION
            } else if (option == 2) {
                System.out.println("Please, insert the deposit amount:");
                double amount = input.nextDouble();
                balance +=a amount;
                System.out.println("Deposit successful!");
                System.out.println(String.format("Your current balance is R$%.2f", balance));

            // TRANFER OPTION
            } else if (option == 3) {
                System.out.println("Please, insert the transfer amount: R$");
                double amount = input.nextDouble();
                if (amount >= balance) {
                    System.out.println("There is not enough balance to complete the transfer...");
                } else {
                    balance -= amount;
                    System.out.println("Transfer successful.");
                    System.out.println(String.format("Your current balance is R$%.2f", balance));
                }

            // EXIT OPTION
            } else if (option == 4) {
                System.out.println("Thanks for using JavaBank! See ya!");
            } else {
                System.out.println("Invalid option. Try again :)");
            }
        }
        input.close();
    }
}
