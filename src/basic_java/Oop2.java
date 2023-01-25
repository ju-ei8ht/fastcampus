package basic_java;

/**
 * 19. 복습
 */
class CarFactory {
    private static CarFactory instance = new CarFactory();
    public static CarFactory  getInstance(){
        if(instance == null) instance = new CarFactory();
        return instance;
    }
    private CarFactory(){}
    public Car createCar(){
        return new Car();
    }
}
class Car{
    private static int serialNum = 10000;

    public int getCarNum(){
        return ++serialNum;
    }
}

public class Oop2 {
    public static void main(String[] args) {
        System.out.println("19:");
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum()); //10001 출력
        System.out.println(yourSonata.getCarNum()); //10002 출력
        System.out.println("-------------------");
    }
}
