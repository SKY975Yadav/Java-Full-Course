import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CWH_100_dateTimeFormat {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.ofYearDay(2021,263);
        //ld.atTime(5,45);
        System.out.println(ld1);
        System.out.println(ld.atTime(3,8));
        System.out.println(ld.getYear());
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy || h:m:s: a-- E:");
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(d1.getLocale());
        System.out.println(d1);
        //DateTimeFormatter d1 = DateTimeFormatter.I;
//        ldt.format("dd/mm/yyyy");
        System.out.println(ldt.format(d));
    }
}
