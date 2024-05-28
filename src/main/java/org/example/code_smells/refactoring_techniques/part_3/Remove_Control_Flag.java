package org.example.code_smells.refactoring_techniques.part_3;

public class Remove_Control_Flag {

    public void searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }
}
