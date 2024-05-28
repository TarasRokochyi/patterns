package org.example.code_smells.refactoring_techniques.part_1;

import java.util.List;

public class Move_Method {

    public class Account {
        private double balance;
        private double interestRate;
        private Bank bank;

        public void calculateInterest(){
            bank.calculateInterest(this);
        }


        public double getBalance() {
            return balance;
        }

        public double getInterestRate() {
            return interestRate;
        }
    }


    public class Bank {

        private List<Account> accounts;

        public void processAccounts(){
            for (Account account : accounts){
                calculateInterest(account);
            }
        }
        public void calculateInterest(Account account){
            double interest = account.getBalance() * account.getInterestRate() / 100;
            System.out.println("Interest calculated: " + interest);
        }
    }
}
