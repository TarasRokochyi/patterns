package org.example.structural.flyweight;

public class MealType {
    public String CostType;
    public boolean Vegetarian;

    public MealType(String costType, boolean vegetarian){
        CostType = costType;
        Vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Cost Type: " + CostType + ", Vegetarian: " + Vegetarian;
    }
}
