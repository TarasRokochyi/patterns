package org.example.structural.flyweight;

import java.util.List;

public class Meal {

    public String Name;
    public int Grams;
    public MealType MealType;

    public Meal(String name, int grams, MealType mealType){
        Name = name;
        Grams = grams;
        MealType = mealType;
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", Grams: " + Grams + ", " + MealType.toString();
    }
}
