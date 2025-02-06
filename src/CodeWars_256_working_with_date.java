import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class CodeWars_256_working_with_date {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return DAYS.between(last, today) > cycleLength;
    }
}
