package org.example.code_smells.refactoring_techniques.part_5;

public class Extract_Interface {

    interface Shape{
        double calculateArea();
        double calculatePerimeter();
    }

    class Rectangle implements Shape{
        private double width;
        private double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double calculateArea() {
            return width * height;
        }
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }
    class Square implements Shape{
        private double side;
        public Square(double side) {
            this.side = side;
        }
        public double calculateArea() {
            return side * side;
        }
        public double calculatePerimeter() {
            return 4 * side;
        }
    }
}
