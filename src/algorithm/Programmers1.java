package algorithm;

import java.util.Arrays;

public class Programmers1 {

    /**
     *1. 두 수의 나눗셈
     */
    public int solution1(int num1, int num2) {
        double result = (double) num1/num2;
        double result2 = result*1000;
        return (int) result2;
    }

    /**
     *2. 숫자 비교하기
     */
    public int solution2(int num1, int num2) {
        if(num1 == num2) return 1;
        return -1;
    }

    /**
     *3. 분수의 덧셈: 최대공약수 구하기 문제
     */
    public int[] solution3(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1*denom2) + (numer2*denom1);
        int denom = denom1*denom2;
        int gcd = getGcd(numer,denom);
        return new int[]{numer/gcd, denom/gcd};
    }
    /**
     *유클리드 호제법
     * gcd(A,B) = gcd(B,A%B)
     */
    public static int getGcd(int a, int b){
        return a%b==0 ? b : getGcd(b, a%b);
        /*
        * 설명하자면,
        * 최대공약수를 구하기 위해 a,b가 나누어 떨어질 때까지
        * a에 b를 넣고, b에 a%b를 넣어서
        * 나누어 떨어질 때 b의 값이 a와 b의 최대공약수다.
        *
        * 굳이 삼항 연산자 안 쓰고
        * if(a%b == 0) return b;
        * return getGcd(b, a%b);
        * 로 해도 됨
        */
    }

    /**
     *4. 배열 두배 만들기
     */
    public int[] solution4(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
    public static void main(String[] args) {
        Programmers1 programmers = new Programmers1();
        int result1 = programmers.solution1(3,2);
        int result2 = programmers.solution2(2,3);
        int[] result3 = programmers.solution3(1,2,3,4);
        int[] result4 = programmers.solution4(new int[]{1,2,3,4,5});
        System.out.println("1: "+result1);
        System.out.println("2: "+result2);
        System.out.println("3: "+Arrays.toString(result3));
        System.out.println("4: "+Arrays.toString(result4));
    }
}
