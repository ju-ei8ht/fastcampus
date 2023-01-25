package algorithm;

import java.util.Arrays;

public class Programmers15 {

    /**
     * 1. 편지
     */
    public int solution1(String message){
        return message.length()*2;
    }

    /**
     * 2. 가장 큰 수 찾기
     */
    public int[] solution2(int[] array){
        int max = array[0];
        int idx = 0;
        for(int i=0; i<array.length; i++){
            if(max < array[i]) {
                max = array[i];
                idx  = i;
            }
        }
        return new int[]{max,idx};
    }

    /**
     * 3. 문자열 계산하기
     */
    public int solution3(String my_string){
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        for(int i=0; i<str.length-1; i++){
            if(str[i].equals("+")) answer += Integer.parseInt(str[i+1]);
            else if(str[i].equals("-")) answer -= Integer.parseInt(str[i+1]);
        }
        return answer;
    }

    /**
     * 4. 배열의 유사도
     */
    public int solution4(String[] s1, String[] s2){
        int answer = 0;
        for(String ss1:s1){
            for(String ss2:s2){
                if(ss1.equals(ss2)) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Programmers15 programmers = new Programmers15();
        int result1 = programmers.solution1("I love you~");
        System.out.println("1: "+result1);
        int[] result2 = programmers.solution2(new int[]{1,8,3});
        System.out.println("2: "+Arrays.toString(result2));
        int result3 = programmers.solution3("3 + 4 - 5");
        System.out.println("3: "+result3);
        int result4 = programmers.solution4(new String[]{"n", "omg"},new String[]{"m", "dot"});
        System.out.println("4: "+result4);
    }
}
