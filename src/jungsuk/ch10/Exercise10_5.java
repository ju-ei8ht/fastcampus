package jungsuk.ch10;

import java.time.LocalDate;

public class Exercise10_5 {

    static int getDayDiff(String yyyymmdd1, String yyyymmdd2){
        if(yyyymmdd1.length() != 8 || yyyymmdd2.length() != 8) return 0;
        int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
        int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
        int month1 = Integer.parseInt(yyyymmdd1.substring(4,6));
        int month2 = Integer.parseInt(yyyymmdd2.substring(4,6));
        int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
        int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));

        int dayDiff = ((year1*360)+(month1*30)+day1)-((year2*360)+(month2*30)+day2);
        if(dayDiff < 0) return 0;
        return dayDiff;
    }

    public static void main(String[] args){
        System.out.println(getDayDiff("20010103","20010101"));
        System.out.println(getDayDiff("20010103","20010103"));
        System.out.println(getDayDiff("20010103","200103"));
    }
}
