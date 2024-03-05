package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MealTypeFactory {
    private static Map<String, MealType> mealTypes = new HashMap<String, MealType>();

    public static MealType getMealType(String costType, boolean vegetarian){
        MealType mealType = mealTypes.get(costType + " " + vegetarian);
        if(mealType == null){
            mealType = new MealType(costType, vegetarian);
            mealTypes.put(costType + " " + vegetarian, mealType);
        }
        return mealType;
    }
}