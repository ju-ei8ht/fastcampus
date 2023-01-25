package javajungsuk.ch06.박주영;

class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1){
        double x2 = (x1-x)*(x1-x);
        double y2 = (y1-y)*(y1-y);
        return Math.sqrt(x2+y2);
    }
}
public class Exercise6_7 {
    public static void main(String[] args){
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
        String str = "ABC123";
    }
}
