package algorithm;

import java.util.Arrays;

public class Programmers {

    public int solution1(String[] babbling){
        int answer = 0;
        String[] nephew = {"aya", "ye", "woo", "ma"};
        Arrays.sort(babbling);
        Arrays.sort(nephew);
        System.out.println(Arrays.toString(babbling));
        System.out.println(Arrays.toString(nephew));
        first:
        for(int i=0; i<babbling.length; i++){
            second:
            for(int j=0; j<nephew.length; j++){
                String n = nephew[j];
                if(babbling[i].equals(n)) answer++;
                else if(babbling[i].length() >= 5 && babbling[i].contains(n)){
//                    String first = babbling[i].substring(0, n.length());
//                    if (first.equals(n)) { //문제는 "mawoo"가 들어왔을 때 순서가 "woo"가 먼저라 "ma"가 skip됨 ㅠㅠ
//                        babbling[i] = babbling[i].replace(n, "");
//                    }
                    //무조건 contains일 때 replace로 지우면 "wyeoo"일 경우에도 통과되니까ㅠㅠ
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Programmers programmers = new Programmers();
        int result = programmers.solution1(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println(result);
    }
}
