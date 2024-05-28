package org.example.code_smells.refactoring_techniques.part_1;

import java.util.Calendar;

public class Introduce_Foreign_Method {

    public class Client {
        // Інші методи класу...
        public void doSomething() {
            Calendar currentDate = Calendar.getInstance();
            if (isWeekend(currentDate)) {
                System.out.println("It's weekend!");
            } else {
                System.out.println("It's not weekend!");
            }
        }

        public static boolean isWeekend(Calendar date){
            int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
            return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
        }
    }

}
