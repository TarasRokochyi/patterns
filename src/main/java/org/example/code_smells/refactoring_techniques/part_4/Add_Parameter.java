package org.example.code_smells.refactoring_techniques.part_4;

public class Add_Parameter {

    public double calculateTotal(double price, int quantity, double tax ){
        return price * quantity * tax;
    }
}
