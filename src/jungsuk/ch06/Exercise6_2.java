package jungsuk.ch06;

public class Exercise6_2 {
    public static void main(String[] args){
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard{
    int num;
    boolean isKwang = true;

    SutdaCard(){}
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    String info(){
        if(this.isKwang == false) return String.valueOf(num);
        else return "1K";
    }
}
