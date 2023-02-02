import java.time.DayOfWeek;
import java.time.LocalDate;

public class Incrementer {
    private LocalDate currentDate;
    private DayOfWeek dayOfWeek;
    public boolean workingDay;
    public Incrementer() {
        this.currentDate = LocalDate.of(2020, 1, 1);
        this.dayOfWeek = currentDate.getDayOfWeek();
        isWorkingDay();
    }

    public void incrementDay() {
        currentDate = currentDate.plusDays(1);
        dayOfWeek = currentDate.getDayOfWeek();
        isWorkingDay();
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public boolean getWorkingDay() {
        return workingDay;
    }

    public void isWorkingDay() {
        if(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            this.workingDay = false;
        } else {
            this.workingDay = true;
        }
    }
}