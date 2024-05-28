package org.example.code_smells.refactoring_techniques.part_2;

public class Replace_Type_Code_with_Class {

    public class Product {
        private ProductType type;
        private String name;
        public Product(ProductType type, String name) {
            this.type = type;
            this.name = name;
        }
        // Додаткові методи...
    }

    public class ProductType{
        private int typeCode;

        public ProductType(int typeCode){
            this.typeCode = typeCode;
        }
    }
}
