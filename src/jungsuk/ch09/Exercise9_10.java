package javajungsuk.ch09.박주영;

public class Exercise9_10 {

    static String format(String str, int length, int alignment){
        StringBuilder sb = new StringBuilder();
        String repeat = " ".repeat(length-str.length());
        if(length < str.length()) return str.substring(0,length);

        switch(alignment){
            case 0:
                sb.append(str);
                sb.append(repeat);
                break;
            case 1:
                String repeat1 = " ".repeat((length-str.length()) / 2);
                sb.append(repeat1);
                sb.append(str);
                sb.append(repeat1);
                break;
            case 2:
                sb.append(repeat);
                sb.append(str);
                break;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str = "가나다";

        System.out.println(format(str,7,0));//왼쪽정렬
        System.out.println(format(str,7,1));//가운데정렬
        System.out.println(format(str,7,2));//오른쪽정렬
    }
}
