import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;
public class date_time {
    public static void main(String[] args) {
        //1.localDate
//        LocalDate now = LocalDate.now();
//        System.out.println("Current date: " + now);
//        LocalDate specificDate = LocalDate.of(2023, 10, 1);
//        System.out.println("Specific date: " + specificDate);
//        int dayOfMonth = now.getDayOfMonth();
//        Month month = now.getMonth();
//        int monthValue = now.getMonthValue();
//        int year = now.getYear();
//        System.out.println("Day of month: " + dayOfMonth);
//        System.out.println("Month value: " + monthValue);
//        System.out.println("Month: " + month);
//        System.out.println("Year: " + year);
//        LocalDate yesterday = now.minusDays(1);
//        System.out.println("Yesterday's date: " + yesterday);
//        if(now.isAfter(yesterday)){
//            System.out.println("Today is after yesterday.");
//        } else {
//            System.out.println("Today is not after yesterday.");
//        }
        //2.localTime
//        LocalTime now = LocalTime.now();
//        System.out.println("Current time: " + now);
//        LocalTime specificTime = LocalTime.of(14, 30, 45);
//        System.out.println("Specific time: " + specificTime);
//        String timeString = now.toString();
//        System.out.println("Time as string: " + timeString);
//        String timeinString="14:30:45";
//        LocalTime parsedTime = LocalTime.parse(timeinString);
//        System.out.println("Parsed time: " + parsedTime);
//        LocalTime beforeonehour = now.minusHours(1);
//        System.out.println("Time one hour ago: " + beforeonehour);
//        if(now.isAfter(beforeonehour)){
//            System.out.println("Current time is after one hour ago.");
//        } else {
//            System.out.println("Current time is not after one hour ago.");
//        }
        //3.LocalDateTime
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Current date and time: " + now);
//        LocalDateTime specificDateTime = LocalDateTime.of(2023, 10, 1, 14, 30, 45);
//        System.out.println("Specific date and time: " + specificDateTime);
//        LocalDateTime mydate = LocalDateTime.parse("2023-10-01T14:30:45");
//        System.out.println("My date and time: " + mydate);
        //4.ZonedDateTime
//        ZonedDateTime zonedNow = ZonedDateTime.now();
//        System.out.println("Current date and time with zone: " + zonedNow);
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);
//        ZonedDateTime mytime = ZonedDateTime.of(LocalDateTime.of(2023, 10, 1, 14, 30, 45), ZoneId.of("America/New_York"));
//        System.out.println("Custom date, time and zone " + mytime);
//        ZonedDateTime india =ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//        System.out.println(india);
//        ZonedDateTime newYork=ZonedDateTime.now(ZoneId.of("America/New_York"));
//        System.out.println(newYork);
//        ZoneId zone=india.getZone();
//        System.out.println("Zone ID: " + zone);
//        ZonedDateTime parsedZonedTime = ZonedDateTime.parse("2023-10-01T14:30:45-04:00[America/New_York]");
//        System.out.println("Parsed zoned date and time: " + parsedZonedTime);
        //5.Instant
//        Instant now=Instant.now();
//        System.out.println("Current instant: " + now);
//        Instant instant = now.plusSeconds(3600);
//        System.out.println("Instant after one hour: " + instant);
        //6.Duration
//        Instant start = Instant.now();
//        int sum=0;
//        for(int i=0;i<100000;i++){
//            sum+=i;
//        }
//        Instant end = Instant.now();
//        Duration d1 = Duration.between(start, end);
//        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
//        System.out.println(d1);
//        System.out.println(d2);
//        int i=d1.compareTo(d2);
//        System.out.println("Comparison result: " + i);
//        LocalDateTime a=LocalDateTime.now();
//        //sleep
//        LocalDateTime b=LocalDateTime.now();
//        Duration between = Duration.between(a, b);
//        System.out.println("Duration between two LocalDates: " + between);
        //7.Period
//        LocalDate now = LocalDate.now();
//        LocalDate then = LocalDate.of(2023, 1, 1);
//        Period period = Period.between(now,then);
//        System.out.println("Period between two dates: " + period);
          //same as duration
        //8.DateTimeFormatter
        LocalDate localdate=LocalDate.now();
        DateTimeFormatter myformatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localdate.format(myformatter);
        System.out.println("Formatted date: " + formattedDate);
        String dateString = "01/10/2023";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, dateTimeFormatter);
        System.out.println("Parsed date: " + parsedDate);
        //with time zone also
    }
}
