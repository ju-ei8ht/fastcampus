package javajungsuk.ch09.박주영;

import java.util.Scanner;

public class Exercise9_11 {

    static void gugudan(String s){
        System.out.println("단의 범위는 2와 9 사이의 값이어야 합니다.");
        String[] str = s.split("");
        int s1 = Integer.parseInt(str[0]);
        int s2 = Integer.parseInt(str[1]);
        int min = Math.min(s1,s2);
        int max = Math.max(s1,s2);
        for(int i=min; i<=max; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        gugudan(s);
    }
}
