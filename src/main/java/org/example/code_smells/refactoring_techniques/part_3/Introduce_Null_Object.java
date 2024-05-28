package org.example.code_smells.refactoring_techniques.part_3;

public class Introduce_Null_Object {

    public class Customer {
        private Address address;
        public Customer(Address address) {
            this.address = address;
        }
        public Address getAddress() {
            if (address == null){
                return new NullAdress();
            }
            return address;
        }
    }
    public class Address {
        private String street;
        private String city;
        // Конструктор, геттери та інші методи

    }

    public class NullAdress extends Address{
        public boolean isNull(){
            return true;
        }
    }
}
