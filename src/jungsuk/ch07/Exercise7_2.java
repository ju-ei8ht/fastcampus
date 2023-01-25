package javajungsuk.ch07.박주영;

class SutdaDeck2{
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2(){
        for(int i=0, j=0; i<cards.length; i++, j++){
            boolean isKwang = false;
            if(i > 9 && j > 9) j = 0;
            else if(i == 0 || i == 2 || i == 7) isKwang = true;
            cards[i] = new SutdaCard2(j+1,isKwang);
        }
    }

    void shuffle(){
        for(int i=0; i<cards.length; i++){
            int j = (int) (Math.random()*cards.length);

            SutdaCard2 tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard2 pick(int index){
        return cards[index];
    }

    SutdaCard2 pick(){
        return cards[(int) (Math.random()*cards.length)];
    }
}

class SutdaCard2{
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K":"");
    }
}
public class Exercise7_2 {
    public static void main(String[] args){
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
