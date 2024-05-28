package org.example.code_smells.refactoring_techniques.part_4;

public class Replace_Parameter_with_Method_Call {

    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }
    public class Processor {
        private Calculator calculator;
        public Processor(Calculator calculator) {
            this.calculator = calculator;
        }
        public int process(int x, int y) {
            return calculator.add(x, y);
        }
    }
}
