package javajungsuk.ch07.박주영;

import java.util.ArrayList;

class MyTv2_1{
    private int channel;
    private ArrayList<Integer> prevChannel = new ArrayList<>();
//    private int prevChannel;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    int getChannel(){
        return channel;
    }
    void setChannel(int channel){
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL) System.out.println("없는 채널입니다.");
        else{
            this.channel = channel;
            prevChannel.add(channel);
            if(prevChannel.size()>2) prevChannel.remove(0);
//            prevChannel = this.channel;
//            this.channel = channel;
        }
    }

    void gotoPrevChannel(){
        channel = prevChannel.get(prevChannel.size()-2);
        prevChannel.add(channel);
        if(prevChannel.size()>2) prevChannel.remove(0);
//        setChannel(prevChannel);
    }

}

public class Exercise7_11 {
    public static void main(String[] args){
        MyTv2_1 t = new MyTv2_1();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
