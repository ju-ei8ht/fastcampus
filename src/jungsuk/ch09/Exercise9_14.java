package javajungsuk.ch09.박주영;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9_14 {
    public static void main(String[] args){
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };
        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print(">>");
            String input = s.nextLine().trim();

            if(input.equals("")){
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            String pattern = ".*"+input+".*";
            Pattern p = Pattern.compile(pattern);

            for(String n:phoneNumArr){
                String n1 = n.replace("-","");
//                if(n1.contains(input)){
//                    list.add(n);
//                }

                Matcher m = p.matcher(n1);
                if(m.find()) list.add(n);
            }

            if(list.size()>0){
                System.out.println(list);
                list.clear();
            }else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    }
}
