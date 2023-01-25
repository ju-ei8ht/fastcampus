package javajungsuk.ch06.박주영;

public class Exercise6_6 {
    static double getDistance(int x, int y, int x1, int y1){
        double x2 = (x1-x)*(x1-x);
        double y2 = (y1-y)*(y1-y);
        return Math.sqrt(x2+y2);
    }

    public static void main(String[] args){
        System.out.println(getDistance(1,1,2,2));
    }
}
