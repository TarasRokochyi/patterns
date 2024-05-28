package org.example.code_smells.refactoring_techniques.part_2;

public class Replace_Data_Value_with_Object {

    public class Order {
       private Details details;

       public Order (Details details){
           this.details = details;
       }


        public Details getDetails() {
            return details;
        }

        public void setDetails(Details details) {
            this.details = details;
        }
    }

    public class Details {

        private String customer;
        private double amount;
        // Конструктор та інші методи класу...
        public Details(String customer, double amount) {
            this.customer = customer;
            this.amount = amount;
        }
        public String getCustomer() {
            return customer;
        }
        public void setCustomer(String customer) {
            this.customer = customer;
        }
        public double getAmount() {
            return amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }

        // Other methods of the class
    }
}
