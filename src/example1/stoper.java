package example1;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

class stoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aby rozpocząć pomiar wciśnij enter");
        sc.nextLine();
        Instant now1 = Instant.now();
        System.out.println("Aby zakończyć pomiar wciśnij enter");
        sc.nextLine();
        Instant now2 = Instant.now();
        Duration between = Duration.between(now1, now2);
        System.out.println("Minęło " + between.getSeconds() + " sekund");

    }
}
