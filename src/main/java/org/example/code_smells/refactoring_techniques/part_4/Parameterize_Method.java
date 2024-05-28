package org.example.code_smells.refactoring_techniques.part_4;

public class Parameterize_Method {
    public class Calculator {
        public int calculateSquare(int num, boolean square) {
            if (square)
                return num * num;

            return num * num * num;
        }
    }
}
