package example2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        LocalDate date1 = createDate();
        LocalDate date2 = createDate();
        Period between = Period.between(date1, date2);

        if (date1.isAfter(date2)){
            System.out.println("Późniejsza data to: " + date1);
            System.out.println("Pomiędzy datami upłynęło " + -between.getYears() + " lat, "
                    + -between.getMonths() + " miesięcy, " + -between.getDays() + " dni");
        }
        else {
            System.out.println("Późniejsza data to: " + date2);
            System.out.println("Pomiędzy datami upłynęło " + between.getYears() + " lat, "
                    + between.getMonths() + " miesięcy, " + between.getDays() + " dni");
        }



    }

    private static LocalDate createDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Podaj datę w formacie yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return LocalDate.parse(s,dateTimeFormatter);
    }
    
}
