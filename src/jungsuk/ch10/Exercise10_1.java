package jungsuk.ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.set(2010,0,1);
        for(int i=0; i<12; i++){
            int day = cal.get(Calendar.DAY_OF_WEEK);
            int second = day == 1 ? 8 : 16-day; //다음주 일요일을 찾는 거니까 최대 16일에서 -2~7
            cal.set(Calendar.DAY_OF_MONTH, second);

            //Date로 변환
            Date date = new Date(cal.getTimeInMillis());
            SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd은 F번째 E요일입니다.");
            System.out.println(format.format(date));

            //다음달 1일로 변경
            cal.add(Calendar.MONTH,1);
            cal.set(Calendar.DAY_OF_MONTH,1);
        }
    }
}
