package org.example.code_smells.refactoring_techniques.part_3;

public class Replace_Conditional_with_Polymorphism {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public interface Shape{
        double calculateArea();
    }

    public class Circle implements Shape{

        private double radius;

        public Circle(double radius){
           this.radius = radius;
        }
        @Override
        public double calculateArea() {
            return Math.PI * getRadius() * getRadius();
        }

        public double getRadius() {
            return radius;
        }
    }

    public class Rectangle implements Shape{

        public double width;
        public double length;

        public Rectangle(double width, double length){
            this.width = width;
            this.length = length;
        }

        @Override
        public double calculateArea() {
            return getLength() * getWidth();
        }

        public double getLength(){
            return this.length;
        }

        public double getWidth(){
            return this.width;
        }


    }
}
