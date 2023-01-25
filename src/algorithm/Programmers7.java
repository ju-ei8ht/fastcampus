package algorithm;

import java.util.*;
import java.util.stream.Stream;

public class Programmers7 {

    /**
     * 1. 배열 자르기
     */
    public int[] solution1(int[] numbers, int num1, int num2){
//        int[] answer = new int[num2];
//        System.arraycopy(numbers,num1,answer,0,num2);

//        for(int i=num1, j=0; i<num2+1; i++, j++){
//            if(j == num2) break;
//            answer[j] += numbers[i];
//        }
//        return answer;
        return Arrays.copyOfRange(numbers,num1,num2+1);
    }

    /**
     * 2. 외계행성의 나이
     */
    public String solution2(int age){
        String answer = "";
        int[] digits = Stream.of(String.valueOf(age).split(""))
                .mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<digits.length; i++){
            answer += (char) (digits[i]+97);
        }
        return answer;
    }

    /**
     * 3. 진료순서 정하기
     */
    public int[] solution3(int[] emergency){
        int[] answer = new int[emergency.length];
        int[] copy = new int[emergency.length];
        System.arraycopy(emergency,0,copy,0,emergency.length);
        /*copy = emergency 안 한 이유: 그러면 같은 참조값을 공유하기 때문에
        * copy를 정렬하면 emergency도 정렬됨*/

        Arrays.sort(copy);

        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(copy[i] == emergency[j]) answer[j] = emergency.length-i;
                /*내림차순 정렬한 copy를 0부터 length까지 하나하나 대조해서
                * 같으면 length-해당 index인 거니까*/
            }
        }
        return answer;
    }

    /**
     * 4. 순서쌍의 개수
     */
    public int solution4(int n){
        int answer = 0;
        for(int i=1; i<n+1; i++){
            if(n%i == 0) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Programmers7 programmers = new Programmers7();
        int[] result1 = programmers.solution1(new int[]{1,2,3,4,5},1,2);
        System.out.println("1: "+Arrays.toString(result1));
        String result2 = programmers.solution2(100);
        System.out.println("2: "+result2);
        int[] result3 = programmers.solution3(new int[]{30,10,23,6,100});
        System.out.println("3: "+ Arrays.toString(result3));
        int result4 = programmers.solution4(20);
        System.out.println("4: "+result4);
    }
}
