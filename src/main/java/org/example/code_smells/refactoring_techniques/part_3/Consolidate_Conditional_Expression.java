package org.example.code_smells.refactoring_techniques.part_3;

public class Consolidate_Conditional_Expression {

    public void processPayment(double amount, boolean isMember, boolean
            isDiscountAvailable) {
        if ((amount > 100 && isMember) || (amount > 200 && isDiscountAvailable)) {
            applyDiscount();
        }
    }
    public void applyDiscount(){ }
}
