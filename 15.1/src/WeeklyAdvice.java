public class WeeklyAdvice {
     public static void main(String[] args) {
        Advisor advisor = new DailyAdvisor();

        // Приклад виклику методу для кожного дня тижня
        for (Day day : Day.values()) {
            System.out.println(day + ": ");
            advisor.advise(day);
            System.out.println();
        }
    }
}

// Enum для днів тижня
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Інтерфейс з методом advise
interface Advisor {
    void advise(Day day);
}

// Реалізація інтерфейсу
class DailyAdvisor implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                System.out.println("Arbeit , Feierabend! Arbeit , Feierabend!");
            case FRIDAY ->
                System.out.println("Schönes Wochenende!");
            case SATURDAY, SUNDAY ->
                System.out.println("Freiheit !!!");
        }
    }
}

