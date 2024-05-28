package org.example.code_smells.refactoring_techniques.part_4;

public class Replace_Error_Code_with_Exception {

    public class Calculator {
        public static int divide(int dividend, int divisor) throws Exception {
            if (divisor == 0) {
                throw new Exception("cant divide by zero");
            }
            return dividend / divisor;
        }
        public static void main(String[] args) {
            try{
                int result = divide(10, 0);
                System.out.println("Результат ділення: " + result);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
