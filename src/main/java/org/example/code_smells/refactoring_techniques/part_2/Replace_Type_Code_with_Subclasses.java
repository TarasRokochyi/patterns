package org.example.code_smells.refactoring_techniques.part_2;

public class Replace_Type_Code_with_Subclasses {

    public abstract class Product {
        private String name;
        public Product(String name) {
            this.name = name;
        }
        public abstract void process();
        // Додаткові методи...
    }

    public class ProductType1 extends Product {

        public ProductType1(String name){
            super(name);
        }

        @Override
        public void process() {
            // some logic for product type 1
        }
    }

    public class ProductType2 extends Product {

        public ProductType2(String name){
            super(name);
        }

        @Override
        public void process() {
            // some logic for product type 2
        }
    }
}
