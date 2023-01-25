package javajungsuk.ch09.박주영;

public class Exercise9_4 {
    static void printGraph(int[] dataArr, char ch){
        for(int d:dataArr){
            for(int i=0; i<d; i++){
                System.out.print(ch);
            }
            System.out.println(d);
        }
    }

    public static void main(String[] args){
        printGraph(new int[]{3,7,1,4},'*');
    }
}
