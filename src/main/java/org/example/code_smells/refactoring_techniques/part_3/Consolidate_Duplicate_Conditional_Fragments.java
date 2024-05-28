package org.example.code_smells.refactoring_techniques.part_3;

public class Consolidate_Duplicate_Conditional_Fragments {

    public void processOrder(int quantity, double price) {
        if (quantity > 10 || price > 100) {
            // Дубльований фрагмент
            applyDiscount();
            // Операція 1
        } else {
            // Операція 1
        }

        if (price < 100) {
            // Операція 2
        }
    }

    public void applyDiscount(){}

}
