import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class DemoLocalDate {
    public static void main(String[] args) {

        // ใช้จัดการกับวันที่
        LocalDate toDay = LocalDate.now(); // toDay -> instance / object
        System.out.println(toDay);
        System.out.println(toDay.getDayOfYear()); // ดูว่าข้อมูลของวันที่ เป็นวันที่เท่าไหร่ของปี

        LocalDate day199 = LocalDate.ofYearDay(2022, 199); // ดูว่าวันที่เป็นลำดับที่ 199 ของปีเป็นอะไร
        System.out.println(day199); 

        LocalDate worldCup2014 = LocalDate.of(2023, Month.JUNE, 12);
        System.out.println(toDay.until(worldCup2014, ChronoUnit.DAYS)); // คำนวรจำนวนวันที่ห่างกันของทั้ง 2 วันที่

        LocalDate myBirthDay = LocalDate.of(2001, Month.JUNE, 2);
        System.out.println(toDay.until(myBirthDay, ChronoUnit.DAYS));
        System.out.printf("%d year, %d month, %d day\n",
        myBirthDay.until(toDay).getYears(),
        myBirthDay.until(toDay).getMonths(),
        myBirthDay.until(toDay).getDays());
        // Get dateime by utc 
        // If want time zone of thailand, I can add 7 hour (UTC + 7)
        System.out.println(LocalDateTime.now(ZoneOffset.UTC).plusHours(7));
    }
}
