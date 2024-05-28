package org.example.code_smells.refactoring_techniques.part_4;

public class Separate_Query_from_Modifier {

    public class Account {
        private double balance;
        public double getBalance() {
            takeCommission();
            return balance;
        }

        public void takeCommission(){
            double commission = 0.05;
            balance -= balance * commission;
        }
    }
}
