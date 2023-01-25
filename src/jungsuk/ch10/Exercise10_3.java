package jungsuk.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Exercise10_3 {
    public static void main(String[] args) throws ParseException {
        String str = "123,456,789.5";
        System.out.println("data:"+str);
        str = str.replace(",","");
        str = str.replace(".","");
        int num = (int) Math.round(Integer.parseInt(str)*0.1);
        System.out.println("반올림:"+num);

//        DecimalFormat df2 = new DecimalFormat("#,###.##");
//        Number num = df2.parse(str);
//        double d = num.doubleValue();
//        System.out.println("반올림:"+Math.round(d));

        DecimalFormat df = new DecimalFormat("#,####");
        System.out.println("만단위:"+df.format(num));
    }
}
