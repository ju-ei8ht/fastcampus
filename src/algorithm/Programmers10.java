package algorithm;

import java.util.Arrays;

public class Programmers10 {

    /**
     * 1. 주사위의 개수
     */
    public int solution1(int[] box, int n){
        int width = box[0]/n;
        int length = box[1]/n;
        int height = box[2]/n;

        return width*length*height;
    }

    /**
     * 2. 합성수 찾기
     */
    public int solution2(int n){
        int answer = 0;
        for(int i=0; i<=n; i++){
            answer += checkPrime(i);
        }
        return answer;
    }
    public static int checkPrime(int number){
        for(int i=2; i*i<=number; i++){
            if(number%i == 0) return 1;
        }
        return 0;
    }

    /**
     * 3. 최댓값 만들기(1)
     */
    public int solution3(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }

    /**
     * 4. 팩토리얼
     */
    public int solution4(int n){
        int answer = 0;
        for(int i=1; i<=10; i++){ //최대 10팩토리얼
            if(fact(i) <= n) answer = i;
        }
        return answer;
    }

    public static int fact(int n) {
        if (n <= 1) return 1;
        else return fact(n - 1) * n;
    }

    public static void main(String[] args){
        Programmers10 programmers = new Programmers10();
        int result1 = programmers.solution1(new int[]{10,8,6},3);
        System.out.println("1: "+result1);
        int result2 = programmers.solution2(15);
        System.out.println("2: "+result2);
        int result3 = programmers.solution3(new int[]{0,31,24,10,1,9});
        System.out.println("3: "+result3);
        int result4 = programmers.solution4(7);
        System.out.println("4: "+result4);
    }
}
