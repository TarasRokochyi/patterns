package org.example.code_smells.refactoring_techniques.part_4;

public class Replace_Exception_with_Test {

    public class TemperatureConverter {
        public static double convertToCelsius(double fahrenheit) {
            if (fahrenheit < -459.67) {
                return -1;
            }
            return (fahrenheit - 32) * 5 / 9;
        }
        public static void main(String[] args) {
            double celsius = convertToCelsius(-500); // Викидає виключення через недійсну температуру
            System.out.println("Температура в градусах Цельсія: " + celsius);
        }
    }
}
