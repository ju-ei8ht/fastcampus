package javajungsuk.ch06.박주영;

public class Exercise6_22 {

    static boolean isNumber(String str){
        boolean isAllNumber = true;
        for(char c : str.toCharArray()){
            if(c < 47 || c > 58){
                isAllNumber = false;
                break;
            }
        }
        return isAllNumber;
    }

    public static void main(String[] args){
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234c";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
