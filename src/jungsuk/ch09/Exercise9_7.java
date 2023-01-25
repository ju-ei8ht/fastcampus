package javajungsuk.ch09.박주영;

public class Exercise9_7 {

    static boolean contains(String src, String target){
//        return src.contains(target);
        return src.indexOf(target) != -1;
    }

    public static void main(String[] args){
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
