package javajungsuk.ch07.박주영;

class SutdaCard3{
    private int num;
    private boolean isKwang;

    SutdaCard3(){
        this(1, true);
    }

    SutdaCard3(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K":"");
    }
}

public class Exercise7_14 {
    public static void main(String[] args){
        SutdaCard3 card = new SutdaCard3(0, true);
    }
}
