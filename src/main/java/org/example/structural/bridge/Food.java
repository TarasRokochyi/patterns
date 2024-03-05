package org.example.structural.bridge;

public interface Food {
    boolean hasDish(String name);

    String getIngredints(String name);

    DishB makeDish(String name, String ingredients);
}
