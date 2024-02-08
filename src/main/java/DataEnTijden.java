import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataEnTijden {
    public static void main(String[] args) {

        // enkel datum
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2022, 2, 4);

        // datum en tijd
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2022, 3, 4, 1, 23, 4, 4);


        LocalDate ld3 = ld2.plusWeeks(12);
        LocalDateTime ldt3 = ldt2.plusMinutes(3);

        // alleen time
        LocalTime lt = LocalTime.now();

    }
}
