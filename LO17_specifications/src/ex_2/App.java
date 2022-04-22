package ex_2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class App {
    public static void main(String[] args) {

        LocalDate rental1 = LocalDate.of(2023,1, 25);
        LocalDate rental2 = LocalDate.of(2022,4,1);

        Period per = rental1.until(rental2);


        Rental r1 = new Rental(10,per ,rental1,1000);
        Rental r2 = new Rental(12,per,rental2,2000);



    }
}
