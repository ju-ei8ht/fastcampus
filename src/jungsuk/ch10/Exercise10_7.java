package jungsuk.ch10;

import java.time.LocalDate;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;

public class Exercise10_7 {

    static LocalDate tuesday(){
        int day = 1;
        for(int i=1; i<8; i++){
            LocalDate date = LocalDate.of(2016,12,i);
            if(String.valueOf(date.getDayOfWeek()).equals("TUESDAY")) day = 21 + i;
        }
        return LocalDate.of(2016,12,day);
    }

    public static void main(String[] args){
//        System.out.println(tuesday());
        LocalDate date = LocalDate.of(2016,12,1);
        System.out.println(date.with(dayOfWeekInMonth(4,TUESDAY)));
    }
}
