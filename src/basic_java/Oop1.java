package basic_java;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 8-1. 복습
 */
class Person{
    private int height;
    private int weight;
    private Enum gender;
    private String name;
    private int age;

    enum Gender{남성,여성}

    public Person(){}
    public Person(int height, int weight, Enum Gender, String name, int age){
        this.height = height;
        this.weight = weight;
        this.gender = Gender;
        this.name = name;
        this.age = age;
    }

    public String showPersonInfo(){
        return "키가 "+height+"이고 몸무게가 "+weight+" 킬로인 "
                +gender+"이 있습니다. 이름은 "+name+"이고 나이는 "
                +age+"세입니다.";
    }
}

/**
 * 8-2. 복습
 */
class Order{
    private long id;
    private String phone;
    private String address;
    private LocalDate date;
    private LocalTime time;
    private int price;
    private String menuNum;

    public Order(long id, String phone, String address, LocalDate date, LocalTime time, int price, String menuNum){
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNum = menuNum;
    }

    public String showOrderInfo(){
        DecimalFormat df = new DecimalFormat("###,###");
        phone = phone.substring(0,3)+"-"+phone.substring(3,7)+"-"+phone.substring(7,11);
        return "음식점에 배달 주문이 들어왔습니다."+"\n"+
                "주문 접수 번호: "+id+"\n"+
                "주문 핸드폰 번호: "+phone+"\n"+
                "주문 집 주소: "+address+"\n"+
                "주문 날짜: "+date+"\n"+
                "주문 시간: "+time+"\n"+
                "주문 가격: "+df.format(price)+"\n"+
                "메뉴 번호: "+menuNum;
    }
}

/**
 * 15. 복습
 */
class Passenger{
    String name;
    int money;

    public Passenger(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        if(this.money >= taxi.price) {
            taxi.take();
            this.money -= taxi.price;
        }else System.out.println("금액이 부족합니다.");
    }

    public void showInfo(){
        System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
    }
}

/**
 * 15. 복습
 */
class Taxi{
    String name;
    int money;
    int price;
    int passengerCount;

    public Taxi(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void take(){
        this.money += this.price;
        passengerCount++;
    }

    public void showTaxiInfo(){
        System.out.println(name+"택시 수입은 "+money+"원 입니다.");
    }
}
public class Oop1 {
    public static void main(String[] args) {
        System.out.println("8-1:");
        Person person = new Person(180,78,Person.Gender.남성,"Tomas",37);
        System.out.println(person.showPersonInfo());
        System.out.println("-------------------");

        System.out.println("8-2:");
        LocalDate date = LocalDate.of(2020,11,02);
        LocalTime time = LocalTime.of(13,02,58);
        Order order = new Order(202011020003l,"01034560001","서울시 강남구 역삼동 111-333",date,time,35000,"0003");
        System.out.println(order.showOrderInfo());
        System.out.println("-------------------");


        System.out.println("15:");
        Passenger passenger = new Passenger("Edward",20000);
        Taxi taxi = new Taxi("잘나간다 운수",10000);
        passenger.takeTaxi(taxi);
        passenger.showInfo();
        taxi.showTaxiInfo();
    }
}
