package algorithm;

import java.util.*;

public class Programmers12 {

    /**
     * 1. 컨트롤 제트
     */
    public int solution1(String s){
        int answer = 0;
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("Z")) answer -= Integer.parseInt(str[i-1]);
            else answer += Integer.parseInt(str[i]);
        }
        return answer;
    }

    /**
     * 2. 배열 원소의 길이
     */
    public int[] solution2(String[] strlist){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<strlist.length; i++){
            answer.add(strlist[i].split("").length);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 3. 중복된 문자 제거
     */
    public String solution3(String my_string){
        String answer = "";
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        for(String str:my_string.split("")) hs.add(str);
        for(String s:hs) answer += s;
        return answer;
    }

    /**
     * 4. 삼각형의 완성조건(1)
     */
    public int solution4(int[] sides){
        Arrays.sort(sides);
        int max = sides[sides.length-1];
        if(sides[0]+sides[1] > max) return 1;
        return 2;
    }

    public static void main(String[] args){
        Programmers12 programmers = new Programmers12();
        int result1 = programmers.solution1("10 20 30 40");
        System.out.println("1: "+result1);
        int[] result2 = programmers.solution2(new String[]{"I", "Love", "Programmers."});
        System.out.println("2: "+ Arrays.toString(result2));
        String result3 = programmers.solution3("people");
        System.out.println("3: "+result3);
        int result4 = programmers.solution4(new int[]{199, 72, 222});
        System.out.println("4: "+result4);
    }
}