package org.example.code_smells.refactoring_techniques.part_2;

import java.util.ArrayList;
import java.util.List;

public class Replace_Magic_Number_with_Symbolic_Constant {

    public class Example {
        private static final int LIMIT = 100;
        public static void example(String[] args) {
            List<String> items = new ArrayList<>();
            // Додавання елементів у список
            for (int i = 0; i < LIMIT; i++) {
                items.add("Item " + i);
            }
        }
    }
}
