package org.example.code_smells.refactoring_techniques.part_3;

public class Replace_Nested_Conditional_with_Guard_Clauses {

    public void processOrder(int quantity, double price) {
        if (quantity < 0){
            System.out.println("Invalid quantity");
            return;
        }
        if (price < 0){
            System.out.println("Invalid price");
            return;
        }
        System.out.println("Order processed successfully");
    }
}
