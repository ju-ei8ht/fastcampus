package algorithm;

import java.util.Arrays;

public class Programmers17 {

    /**
     * 1. 문자열 안에 문자열
     */
    public int solution1(String str1, String str2){
//        int answer = 2;
//        char[] str3 = str1.toCharArray();
//        char[] str4 = str2.toCharArray();
//        if(str3.length > str4.length){
//            first:
//            for(int i=0; i<str3.length; i++){
//                if(str3[i] == str4[0]){
//                    int j=1;
//                    while (j<str4.length && i+j<str3.length){
//                        if(str3[i+j] == str4[j]) {
//                            answer = 1;
//                        }
//                        else{
//                            answer = 2;
//                            i++;
//                            continue first;
//                        }
//                        j++;
//                    }while(j==str4.length) break first;
//                }
//            }
//        }
        if(str1.length() >= str2.length() && str1.contains(str2)) return 1;
        return 2;
    }

    /**
     * 2. 제곱수 판별하기
     */
    public int solution2(int n){
        if(Math.sqrt(n) == Double.valueOf(Math.sqrt(n)).intValue()) return 1;
        return 2;
    }

    /**
     * 3. 세균 증식
     */
    public int solution3(int n, int t){
        int answer = n;
        for(int i=0; i<t; i++) answer *= 2;
        return answer;
    }

    /**
     * 4. 문자열 정렬하기(2)
     */
    public String solution4(String my_string){
        char[] chars = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            if(chars[i] > 64 && chars[i] < 91) chars[i] += 32;
        }
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String[] args){
        Programmers17 programmers = new Programmers17();
        int result1 = programmers.solution1("abcde","de");
        System.out.println("1: "+result1);
        int result2 = programmers.solution2(144);
        System.out.println("2: "+result2);
        int result3 = programmers.solution3(7,15);
        System.out.println("3: "+result3);
        String result4 = programmers.solution4("Bcad");
        System.out.println("4: "+result4);
    }
}
