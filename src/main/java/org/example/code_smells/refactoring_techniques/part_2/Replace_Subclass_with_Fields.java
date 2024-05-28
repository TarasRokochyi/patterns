package org.example.code_smells.refactoring_techniques.part_2;

public class Replace_Subclass_with_Fields {

    public class Shape {
        // Інші поля та методи
        public double getCircleArea(int radius) {
            return Math.PI * radius * radius;
        }
        public double getCirclePerimeter(int radius) {
            return 2 * Math.PI * radius;
        }

        public double getRectangleArea(int width, int height) {
            return width * height;
        }
        public double getRectanglePerimeter(int width, int height) {
            return 2 * (width + height);
        }
    }
}
