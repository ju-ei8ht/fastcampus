package javajungsuk.ch09.박주영;

public class Exercise9_9 {

    static String delChar(String src, String delCh){
//        for(char d:delCh.toCharArray()){
//            if(src.contains(String.valueOf(d))) src = src.replace(String.valueOf(d),"");
//        }
//        return src;

//        StringBuffer sb = new StringBuffer();
//        sb.append(src);
//        for(int i=0; i<sb.length(); i++){
//            for(char d:delCh.toCharArray()){
//                int index = sb.indexOf(String.valueOf(d));
//                if(index != -1) sb.deleteCharAt(index);
//            }
//        }

        StringBuffer sb = new StringBuffer(src.length());
        for(char ch:src.toCharArray()){
            if(delCh.indexOf(ch) == -1) sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println("(1!2@3^4~5)"+" -> "
        + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2    3   4\t5)"+" -> "
        + delChar("(1 2    3   4\t5)"," \t"));
    }
}
