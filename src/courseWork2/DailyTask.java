package courseWork2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task{

    public DailyTask(String title, Type type, String description) {
        super(title, type, description);
    }

    @Override
    public boolean appearsIn(LocalDateTime dateTime) {
        return true;
    }

    @Override
    public LocalDate getNextDate(LocalDateTime dateTime) {
        LocalDate localDate = dateTime.toLocalDate();
        return localDate.plusDays(1);
    }

    @Override
    public String toString() {
        return  super.toString() + "\n повторять ежедневно";
    }
}
