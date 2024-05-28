package org.example.code_smells.refactoring_techniques.part_5;

public class Extract_Subclass {

    public abstract class Vehicle {
        private int numberOfWheels;
        private boolean hasEngine;


        public Vehicle(int numberOfWheels, boolean hasEngine) {
            this.numberOfWheels = numberOfWheels;
            this.hasEngine = hasEngine;
        }

        public int getNumberOfWheels() {
            return numberOfWheels;
        }

        public boolean hasEngine() {
            return hasEngine;
        }
    }

    public class Car extends Vehicle {

        public Car() {
            super(4, true);
        }

        public void playRadio() {
            System.out.println("Playing radio...");
        }
    }

    public class Bike extends Vehicle {

        public Bike() {
            super(2, false);
        }

        public void ringBell() {
            System.out.println("Ringing bell...");
        }
    }
}
