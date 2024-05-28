package org.example.code_smells.refactoring_techniques.part_2;

public class Change_Reference_to_Value {

    public class ImmutablePoint {
        private final int x;
        private final int y;
        public ImmutablePoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
