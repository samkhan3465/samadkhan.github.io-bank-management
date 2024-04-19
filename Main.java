import java.util.Scanner;

public class Main {

    //Function for Current Account
    public static float currentAccount(Scanner sc, float initialBal) {
        System.out.println("You Have selected Current Account");
        System.out.println("1. Deposit Money");
        System.out.println("2. WithDraw Money");
        System.out.println("3. Main Menu");
        System.out.println("Enter your choice: ");
        int chocie = sc.nextInt();

        switch (chocie) {
//Deposit Money

            case 1: {
                System.out.printf("Balance: %.2f", initialBal);
                System.out.println("\nDeposit Money: ");
                float deposit = sc.nextFloat();
                initialBal += deposit;
                System.out.printf("\nNew Balance: %.2f", initialBal);
                break;
            }
//With Draw Money
            case 2: {
                System.out.printf("\nInitial Balance: %.2f", initialBal);

                System.out.println("\nWith Draw: ");

                float deposit = sc.nextFloat();
                if (deposit == 0 || deposit>0) {
                    initialBal -= deposit;
                    System.out.printf("\nNew Balance: %.2f", initialBal);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            }
//Return to Main Menu
            case 3: {
                break;
            }

        }

        return initialBal;

    }

    public static float savingAcc(Scanner sc, float initialBal) {
        System.out.println("You Have selected Saving Account");
        System.out.println("1. Deposit Money");
        System.out.println("2. WithDraw Money");
        System.out.println("3. Main Menu");
        System.out.println("Enter your choice: ");
        int chocie = sc.nextInt();

        switch (chocie) {
//Deposit Money
            case 1: {

                System.out.printf("Initial Balance: %.2f", initialBal);

                System.out.println("\nDeposit Money: ");
                float deposit = sc.nextFloat();
                initialBal += deposit;
                System.out.printf("\nNew Balance: %.2f", initialBal);
                break;
            }
//With Draw Money
            case 2: {
                System.out.printf("\nInitial Balance: %.2f", initialBal);

                System.out.println("\nWith Draw: ");

                float deposit = sc.nextFloat();
                if (deposit == 0) {
                    System.out.println("Insufficient Balance");
                    initialBal -= deposit;
                    System.out.printf("\nNew Balance: %.2f", initialBal);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            }
//Return to Main Menu
            case 3: {
                break;
            }

        }
        return initialBal;
    }

    public static void main(String args[]) {
        int choice;
        float initialBal = 100f;
        do {
            System.out.println("\nWelcome");
            System.out.println("Press 1 for Current Account");
            System.out.println("Press 2 for Savings Account");
            System.out.println("Press 3 for Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
//For Current Account
                case 1: {
                    float deposit = 0.0f;
                    initialBal = currentAccount(sc, initialBal);
                    break;
                }
                case 2: {
                    initialBal = savingAcc(sc, initialBal);
                    break;
                }
                case 3: {
                    System.out.println("Exiting...");
                    System.exit(1);
                }
                default: {
                    System.out.println("Invalid Choice");
                }
            }
        } while (choice != 0);
    }
}