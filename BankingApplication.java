package com.codealpha.OnlineQuiz;
import java.util.Scanner;

public class BankingApplication {
    private static double balance = 0;
    static Scanner scanner = new Scanner(System.in);
   static boolean isRunning=true;

    public static void main(String[] args) {
        while (isRunning) {
            System.out.println("Welcome to Simple Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking application.");
                    isRunning=false;
                    break;
                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
            System.out.println("Updated balance: "+ balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private static void withdraw() {
        System.out.println("Enter the amount to withdraw: ");
        System.out.println(" ");
       
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Updated balance: "+ balance);
        } else {
            System.out.println("insufficient balance.");
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

}
