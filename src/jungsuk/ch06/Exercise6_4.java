package jungsuk.ch06;

public class Exercise6_4 {
    public static void main(String[] args){
        Student1 s = new Student1();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}

class Student1{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        float average = (float) getTotal()/3;
        return (float) (Math.round(average*10)/10.0);
    }
}
