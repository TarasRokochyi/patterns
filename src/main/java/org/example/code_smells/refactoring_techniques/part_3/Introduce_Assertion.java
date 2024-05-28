package org.example.code_smells.refactoring_techniques.part_3;

public class Introduce_Assertion {

    public double calculateAverage(int[] numbers) {
        if (numbers == null){
            System.out.println("array cannot be null");
            return 0;
        }

        if (numbers.length <= 0){
            System.out.println("array cannot be empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
