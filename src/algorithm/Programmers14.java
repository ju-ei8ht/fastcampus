package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class Programmers14 {

    /**
     * 1. 영어가 싫어요
     */
    public long solution1(String numbers){
        char[] chars = numbers.toCharArray();
        String answer = "";
        for(int idx=0; idx<chars.length;){
            char now = chars[idx];
            char next = chars[idx+1];
            if(now == 'z'){
                idx += 4;
                answer += 0;
            } else if(now == 'o') {
                idx += 3;
                answer += 1;
            } else if (now == 't') {
                if(next == 'w') {
                    idx += 3;
                    answer += 2;
                }
                else {
                    idx += 5;
                    answer += 3;
                }
            } else if (now == 'f') {
                if(next == 'o') {
                    idx += 4;
                    answer += 4;
                }
                else {
                    idx += 4;
                    answer += 5;
                }
            } else if (now == 's') {
                if(next == 'i') {
                    idx += 3;
                    answer += 6;
                }
                else {
                    idx += 5;
                    answer += 7;
                }
            } else if (now == 'e') {
                idx += 5;
                answer += 8;
            }
            else {
                idx += 4;
                answer += 9;
            }
        }
        return Long.parseLong(answer);
    }

    /**
     * 2. 인덱스 바꾸기
     */
    public String solution2(String my_string, int num1, int num2){
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(i == num1) {
                answer += str[num2];
                continue;
            }
            else if(i == num2) {
                answer += str[num1];
                continue;
            }
            answer += str[i];
        }
        return answer;
    }

    /**
     * 3. 한 번만 등장한 문자
     */
    public String solution3(String s){
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String str:s.split("")){
            hm.put(str, hm.getOrDefault(str,0)+1);
        }
        List<Map.Entry<String,Integer>> entries =
                hm.entrySet().stream().sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList());
        for(Map.Entry<String,Integer> entry : entries){
            if(entry.getValue() == 1) answer += entry.getKey();
        }
        return answer;
    }

    /**
     * 4. 약수 구하기
     */
    public int[] solution4(int n){
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<n+1; i++){
            if(n%i == 0) answer.add(n/i);
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        Programmers14 programmers = new Programmers14();
        long result1 = programmers.solution1("onefourzerosixseven");
        System.out.println("1: "+result1);
        String result2 = programmers.solution2("I love you",3,6);
        System.out.println("2: "+result2);
        String result3 = programmers.solution3("hello");
        System.out.println("3: "+result3);
        int[] result4 = programmers.solution4(29);
        System.out.println(Arrays.toString(result4));
    }
}
