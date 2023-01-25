package jungsuk.ch10;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exercise10_4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

//        String pattern = "yyyy/MM/dd";
//        String pattern2 = "입력하신 날짜는 E요일입니다.";
//
//        DateFormat df = new SimpleDateFormat(pattern);
//        DateFormat df2 = new SimpleDateFormat(pattern2);

//        Date date = null;
        do{
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요. (입력예:2007/05/11)");
            try{
                System.out.print(">>");
                String input = s.next();
                String[] date = input.split("/");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);
                LocalDate d = LocalDate.of(year,month,day);
                System.out.println("입력하신 날짜는 "+d.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREA)+"입니다.");

//                date = df.parse(s.next());
                break;
            }catch(Exception e){}
        }while (true);
//        System.out.println(df2.format(date));
    }
}
