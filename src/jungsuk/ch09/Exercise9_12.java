package javajungsuk.ch09.박주영;

public class Exercise9_12 {

    static int getRand(int from, int to){
//        int min = Math.min(from,to);
//        return (int)(Math.random()*min);

        return (int) (Math.random() * (Math.abs(to-from)+1)) + Math.min(from,to);
    }

    public static void main(String[] args){
        for(int i=0; i<20; i++){
            System.out.print(getRand(1,-3)+",");
        }
    }
}
