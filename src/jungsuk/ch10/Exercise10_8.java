package jungsuk.ch10;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise10_8 {

    public static void main(String[] args){
        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        ZonedDateTime new_york = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(seoul);
        System.out.println(new_york);

//        long seoulTime = ((seoul.getHour()*60)*60)+(seoul.getMinute()*60)+(seoul.getSecond());
//        long nyTime = ((new_york.getHour()*60)*60)+(new_york.getMinute()*60)+(new_york.getSecond());
        long seoulTime = seoul.getOffset().getTotalSeconds();
        long nyTime = new_york.getOffset().getTotalSeconds();
        System.out.println("sec1="+seoulTime);
        System.out.println("sec2="+nyTime);
//        System.out.println("diff="+(seoul.getHour()-new_york.getHour())+" hrs");
        System.out.printf("diff=%d hrs%n",(seoulTime-nyTime)/3600);
    }
}
