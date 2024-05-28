package org.example.code_smells.refactoring_techniques.part_5;

public class Replace_Delegation_with_Inheritance {

    class Printer {
        void print(String document) {
            System.out.println("Printing: " + document);
        }
    }


    class SecurePrinter extends Printer {
        void printSecurely(String document) {
            System.out.println("Printing securely: " + document);
            print(document);
        }
    }
}
