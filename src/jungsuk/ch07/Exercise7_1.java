package jungsuk.ch07;

class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0, j=0; i<cards.length; i++, j++){
            boolean isKwang = false;
            if(i > 9 && j > 9) j = 0;
            else if(i == 0 || i == 2 || i == 7) isKwang = true;
            cards[i] = new SutdaCard(j+1,isKwang);
        }
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K":"");
    }
}
public class Exercise7_1 {
    public static void main(String[] args){
        SutdaDeck deck = new SutdaDeck();

        for(int i=0; i<deck.cards.length-1; i++){
            System.out.print(deck.cards[i]+",");
        }
        System.out.print(deck.cards[deck.cards.length-1]);
    }
}
