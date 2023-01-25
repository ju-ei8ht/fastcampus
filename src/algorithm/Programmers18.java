package algorithm;

import java.util.Arrays;

public class Programmers18 {

    /**
     * 1. 7의 개수
     */
    public int solution1(int[] array){
        int answer = 0;
        for(int a:array){
            String[] str = String.valueOf(a).split("");
            for(String s:str){
                if(s.equals("7")) answer++;
            }
        }
        return answer;
    }

    /**
     * 2. 잘라서 배열로 저장하기
     */
    public String[] solution2(String my_str, int n){
        int cnt = (int) Math.ceil((double)my_str.length()/n);
        String[] answer = new String[cnt];
        for(int i=0; i<cnt; i++){
            int last = (i*n)+n;
            if(last > my_str.length()) last = my_str.length();
            answer[i] = my_str.substring(i*n,last);
        }
        return answer;
    }

    /**
     * 3. 중복된 숫자 개수
     */
    public int solution3(int[] array, int n){
        int answer = 0;
        for(int a:array) if (a == n) answer++;
        return answer;
    }

    /**
     * 4. 머쓱이보다 키 큰 사람
     */
    public int solution4(int[] array, int height){
        int answer = 0;
        for(int a:array) if (a > height) answer++;
        return answer;
    }

    public static void main(String[] args){
        Programmers18 programmers = new Programmers18();
        int result1 = programmers.solution1(new int[]{7,77,17});
        System.out.println("1: "+result1);
        String[] result2 = programmers.solution2("bcde",3);
        System.out.println("2: "+Arrays.toString(result2));
        int result3 = programmers.solution3(new int[]{1,1,2,3,4,5},1);
        System.out.println("3: "+result3);
        int result4 = programmers.solution4(new int[]{149,180,192,170},167);
        System.out.println("4: "+result4);
    }
}
