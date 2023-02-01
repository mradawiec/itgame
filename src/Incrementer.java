import java.time.DayOfWeek;
import java.time.LocalDate;

public class Incrementer {
    private LocalDate currentDate;
    DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
    boolean workingDay;
    public Incrementer() {
        this.currentDate = LocalDate.of(2020, 1, 1);
    }

    public void incrementDay() {
        currentDate = currentDate.plusDays(1);
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }
    public void setWorkingDay(boolean workingDay) {
        this.workingDay = workingDay;
    }
    public void isWorkingDay() {
        if(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            setWorkingDay(false);
        } else
        {
            setWorkingDay(true);
        }
    }
}
