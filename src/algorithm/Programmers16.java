package algorithm;

import java.util.*;

public class Programmers16 {

    /**
     * 1. 숫자 찾기
     */
    public int solution1(int num, int k){
        int answer = -1;
        int[] nums = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::new).toArray();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }

    /**
     * 2. n의 배수 고르기
     */
    public int[] solution2(int n, int[] numlist){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num:numlist){
            if(num%n == 0) answer.add(num);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 3. 자릿수 더하기
     */
    public int solution3(int n){
        int answer = 0;
        int[] nums = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::new).toArray();
        for(int num:nums) answer += num;
        return answer;
    }

    /**
     * 4. OX퀴즈
     */
    public String[] solution4(String[] quiz){
        String[] answer = new String[quiz.length];
        for(int i=0; i< quiz.length; i++){
            String[] qz = quiz[i].split(" ");
            int a = Integer.parseInt(qz[0]);
            int b = Integer.parseInt(qz[2]);
            int result = Integer.parseInt(qz[qz.length-1]);
            if(qz[1].equals("+")) {
                if(calculate(a, b, "+") == result) answer[i] = "O";
                else answer[i] = "X";
            } else {
                if(calculate(a, b, "-") == result) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        return answer;
    }

    static int calculate(int a, int b, String c){
        return c.equals("+") ? a+b : a-b;
    }

    public static void main(String[] args){
        Programmers16 programmers = new Programmers16();
        int result1 = programmers.solution1(29183,1);
        System.out.println("1: "+result1);
        int[] result2 = programmers.solution2(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println("2: "+ Arrays.toString(result2));
        int result3 = programmers.solution3(1234);
        System.out.println("3: "+result3);
        String[] result4 = programmers.solution4(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        System.out.println("4: "+ Arrays.toString(result4));
    }
}
