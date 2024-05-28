package org.example.code_smells.refactoring_techniques.part_1;

import java.util.Date;

public class Introduce_Local_Extension {

    public class DateHelper {
        // Даний клас надає допоміжні функції пов'язані з роботою з датами.
        public static Date addDays(Date date, int days) {
            // Логіка додавання днів до дати.
            return new Date();
        }
        // Інші методи класу...
    }

    public class DateHelperExtended extends DateHelper {
        public static Date diffDate(Date date1, Date date2){
            return new Date();
        }
    }
}
