package com.jap.customexception;


public class Main {
    public static void main(String[] args) {
        Account account = new Account(5000);

        try {
            System.out.println("Attempting to withdraw $6000...");
            double newBalance = account.withdraw(6000);
            System.out.println("Withdrawal successful! New balance: " + newBalance);
        } catch (InsufficientFundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println("Attempting to withdraw $3000...");
            double newBalance = account.withdraw(3000);
            System.out.println("Withdrawal successful! New balance: " + newBalance);
        } catch (InsufficientFundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
