package lesson1.enums;

public enum DayOfWeeks {
    Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6), Sunday(7);

    int numberDay;

    DayOfWeeks() {
    }

    DayOfWeeks(int number) {
        numberDay = number;
    }

    public int getNumberDay() {
        return numberDay;
    }

    static void getWorkingHours(DayOfWeeks day){
        String res = "Сегодня выходной";
        if ((day.getNumberDay() != 6) && (day.getNumberDay() != 7)) {
            res = String.valueOf((6 - day.getNumberDay()) * 8);
        }
        System.out.println(res);
    }

}
