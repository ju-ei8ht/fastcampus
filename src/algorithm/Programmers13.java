package algorithm;

import java.util.Arrays;

public class Programmers13 {

    /**
     * 1. 가까운 수
     */
    public int solution1(int[] array, int n){
        int[] numbers = new int[array.length];
        for(int i=0; i<array.length; i++){
            numbers[i] = array[i]-n;
        }
        int answer = numbers[0];
        for(int num : numbers){
            if(Math.abs(answer) > Math.abs(num)) answer = num;
            else if(Math.abs(answer) == Math.abs(num) && answer > num) answer = num;
        }
        return answer+n;
    }

    /**
     * 2. 369게임
     */
    public int solution2(int order){
        int answer = 0;
        int[] orders = Arrays.stream(String.valueOf(order).split("")).mapToInt(Integer::new).toArray();
        for(int o:orders){
            if(o == 3 || o == 6 || o == 9) answer++;
        }
        return answer;
    }

    /**
     * 3. 암호 해독
     */
    public String solution3(String cipher, int code){
        String answer = "";
        String[] str = cipher.split("");
        for(int i=1; i*code<=cipher.length(); i++){
            answer += str[(i*code)-1];
        }
        return answer;
    }

    /**
     * 4. 대문자와 소문자
     */
    public String solution4(String my_string){
        String answer = "";
        for(char c:my_string.toCharArray()){
            if(c > 96 && c < 123) c-=32;
            else c+=32;
            answer += Character.toString(c);
        }
        return answer;
    }

    public static void main(String[] args){
        Programmers13 programmers = new Programmers13();
        int result1 = programmers.solution1(new int[]{3,10,28},20);
        System.out.println("1: "+result1);
        int result2 = programmers.solution2(29423);
        System.out.println("2: "+result2);
        String result3 = programmers.solution3("pfqallllabwaoclk",2);
        System.out.println("3: "+result3);
        String result4 = programmers.solution4("abCdEfghIJ");
        System.out.println("4: "+result4);
    }
}
