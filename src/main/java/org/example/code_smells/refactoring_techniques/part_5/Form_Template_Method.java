package org.example.code_smells.refactoring_techniques.part_5;

abstract class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    abstract void boilWater();
    abstract void addIngredients();
    abstract void cook();
    abstract void serve();
}

class PastaRecipe extends CookingRecipe {
    @Override
    void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding pasta");
    }
    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }

    @Override
    void serve() {
        System.out.println("Serving");
    }
}

class CakeRecipe extends CookingRecipe {
    @Override
    void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding flour, sugar, eggs, etc.");
    }
    @Override
    public void cook() {
        System.out.println("Baking the cake in the oven");
    }

    @Override
    void serve() {
        System.out.println("Serving");
    }
}
