package jungsuk.ch10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise10_6 {

    static void born(LocalDate birthday, LocalDate today){
        System.out.println("birth day="+birthday);
        System.out.println("today="+today);
        System.out.println(birthday.until(today, ChronoUnit.DAYS)+" days");
    }

    public static void main(String[] args){
        LocalDate birthday = LocalDate.of(2000,1,1);
        LocalDate today = LocalDate.of(2016,1,29);
        born(birthday,today);
    }
}
