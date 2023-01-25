package javajungsuk.ch09.박주영;

public class Exercise9_6 {
    public static String fillZero(String src, int length){
        String result = "";
        if(src == null || src.length() == length) return src;
        else if(length <= 0) return "";

        if(src.length() > length) result = src.substring(0,length);
        else{
            for(int i=0; i<length-src.length(); i++) result += "0";
            result += src;
        }
        return result;

//        if(src.length() > length) return src.substring(0,length);
//        char[] chars = new char[length];
//        for(int i=0; i<chars.length; i++){
//            chars[i] = '0';
//        }
//        System.arraycopy(src.toCharArray(),
//                0,
//                chars,
//                length-src.length(),
//                src.length());
//        return String.valueOf(chars);
    }

    public static void main(String[] args){
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
}
