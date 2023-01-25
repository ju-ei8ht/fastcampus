package algorithm;

import java.util.Arrays;

public class Programmers5 {
    /**
     * 1. 문자열 뒤집기
     */
    public String solution1(String my_string){
        String[] str = my_string.split("");
        String answer = "";
        for(int i=str.length-1; i>=0; i--){
            answer += str[i];
        }
        return answer;
    }

    /**
     * 2. 직각삼각형 출력하기
     */
    public void solution2(int n){
        System.out.println("2: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 3. 짝수 홀수 개수
     */
    public int[] solution3(int[] num_list){
        int even = 0;
        int odd = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }

    /**
     * 4. 문자 반복 출력하기
     */
    public String solution4(String my_string, int n){
        String[] str = my_string.split("");
        String answer = "";
        for(int i=0; i<str.length; i++){
            for(int j=0; j<n; j++){
                answer += str[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Programmers5 programmers = new Programmers5();
        String result1 = programmers.solution1("bread");
        System.out.println("1: "+result1);
        programmers.solution2(3);
        int[] result3 = programmers.solution3(new int[]{1,3,5,7});
        System.out.println("3: "+Arrays.toString(result3));
        String result4 = programmers.solution4("hello",3);
        System.out.println("4: "+result4);
    }
}
