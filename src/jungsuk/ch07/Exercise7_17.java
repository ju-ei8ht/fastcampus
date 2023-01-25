package javajungsuk.ch07.박주영;

public class Exercise7_17 {
    public static void main(String[] args){
        Marine marine = new Marine();
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        System.out.print("보병 ");
        marine.move(1,2);
        System.out.print("탱크 ");
        tank.move(1,1);
        System.out.print("수송선 ");
        dropship.move(0,0);

        System.out.println();

        System.out.print("보병 ");
        marine.stop();
        System.out.print("탱크 ");
        tank.stop();
        System.out.print("수송선 ");
        dropship.stop();

        System.out.println();

        System.out.print("보병 ");
        marine.stimPack();

        System.out.print("탱크 ");
        tank.changeMode();

        System.out.print("수송선 ");
        dropship.load();
        System.out.print("수솧선 ");
        dropship.unload();
    }
}

class Unit{
    int x, y;
    void move(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("지정된 위치("+x+","+y+")로 이동");
    }

    void stop(){
        System.out.println("현재 위치("+x+","+y+")에 정지");
    }
}

class Marine extends Unit{

    void stimPack(){
        System.out.println("스팀팩을 사용한다.");
    }
}

class Tank extends Unit{

    void changeMode(){
        System.out.println("공격모드를 변환한다.");
    }
}

class Dropship extends Unit{

    void load(){
        System.out.println("선택된 대상을 태운다.");
    }

    void unload(){
        System.out.println("선택된 대상을 내린다.");
    }
}
