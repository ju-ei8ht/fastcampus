package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static java.lang.Math.sqrt;

public class Programmers11 {

    /**
     * 1. 모음 제거
     */
    public String solution1(String my_string){
        String answer = "";
        char[] chars = my_string.toCharArray();
        for(char c : chars){
            if(c != 97 && c != 101 && c != 105 && c != 111 && c != 117) answer += c;
        }
        return answer;
    }

    /**
     * 2. 문자열 정렬하기(1)
     */
    public int[] solution2(String my_string){
        ArrayList<Integer> answer = new ArrayList();
        char[] chars = my_string.toCharArray();
        for(char c : chars){
            if(c < 58) answer.add((int)c-48);
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 3. 숨어있는 숫자의 덧셈(1)
     */
    public int solution3(String my_string){
        int answer = 0;
        char[] chars = my_string.toCharArray();
        for(char c : chars){
            if(c < 58) answer += (int)c-48;
        }
        return answer;
    }

    /**
     * 4. 소인수분해
     */
    public int[] solution4(int n){
        HashSet<Integer> answer = new HashSet<>();
        for(int i=2; i<=sqrt(n); i++){ //i*i <= n
            while(n%i == 0){
                answer.add(i);
                n /= i;
            }
        }
        if(n != 1) answer.add(n);
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        Programmers11 programmers = new Programmers11();
        String result1 = programmers.solution1("nice to meet you");
        System.out.println("1: "+result1);
        int[] result2 = programmers.solution2("hi12392");
        System.out.println("2: "+ Arrays.toString(result2));
        int result3 = programmers.solution3("aAb1B2cC34oOp");
        System.out.println("3: "+result3);
        int[] result4 = programmers.solution4(420);
        System.out.println("4: "+ Arrays.toString(result4));
    }
}
