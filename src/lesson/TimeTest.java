package lesson;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

class TimeTest {
    public static void main(String[] args) throws InterruptedException {
//        Przestażałą wersja.
//        Date date = new Date(1990, 10, 10);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(simpleDateFormat.format(date));
//
//        Instant now1 = Instant.now();
//        for (int i = 0; i < 100000; i++) {
//            System.out.println("Miernik czasu");
//        }
//        Instant now2 = Instant.now();
//        Duration between = Duration.between(now1, now2);
//        System.out.println(between.getNano());

//        LocalTime now = LocalTime.now();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(now.getHour() + ":" + now.getMinute() + ":"+ now.getSecond());
//           now = now.plusSeconds(1);
//           Thread.sleep(1000);

//        LocalDate now = LocalDate.now();
//        LocalDate firstJan2014 = LocalDate.of(2014, 1, 1);
//        System.out.println(now.getDayOfMonth());
//        System.out.println(now.isAfter(firstJan2014));
//        System.out.println(now.getYear());


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tworzę nowe wydarzenie.");
//        System.out.println("Podaj dzień");
//        int day = sc.nextInt();
//        System.out.println("Podaj miesiąc");
//        int month = sc.nextInt();
//        System.out.println("Podaj rok");
//        int year = sc.nextInt();
//
//        LocalDate createdDate = LocalDate.of(year, month, day);
//        System.out.println("Wydarzenie utworzone na dzień " + createdDate);

        Scanner sc = new Scanner(System.in);
        System.out.println("Tworzę nowe wydarzenie.");
        System.out.println("Podaj datę w formacie yyyy-MM-dd");
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateInput = sc.nextLine();


        LocalDate createdDate = LocalDate.parse(dateInput,datePattern);
        System.out.println("Wydarzenie utworzone na dzień " + createdDate);
    }
}
