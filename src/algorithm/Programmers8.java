package algorithm;

import java.util.HashMap;

public class Programmers8 {

    /**
     * 1. 개미 군단
     */
    public int solution1(int hp){
        int answer = hp/5;
//        switch (hp%5){
//            case 4: case 2:
//                answer += 2;
//                break;
//            case 3: case 1:
//                answer += 1;
//                break;
//        }
        if(hp%5 != 0){
            if((hp%5)%2 == 0) answer += 2;
            else answer += 1;
            /*결국 5로 나누어떨어지지 않으면 남는 건 4,3,2,1인데
            * 4 == 3,1  3 == 3  2 == 1,1  1 == 1이라
            * 짝수면 2마리, 홀수면 1마리 추가된다.*/
        }
        return answer;
    }

    /**
     * 2. 모스부호(1)
     */
    public String solution2(String letter){
        String answer = "";
        String[] letters = letter.split(" ");
        HashMap<String, String> morse = new HashMap<>();
//        morse.put(".-","a");
//        morse.put("-...","b");
//        morse.put("-.-.","c");
//        morse.put("-..","d");
//        morse.put(".","e");
//        morse.put("..-.","f");
//        morse.put("--.","g");
//        morse.put("....","h");
//        morse.put("..","i");
//        morse.put(".---","j");
//        morse.put("-.-","k");
//        morse.put(".-..","l");
//        morse.put("--","m");
//        morse.put("-.","n");
//        morse.put("---","o");
//        morse.put(".--.","p");
//        morse.put("--.-","q");
//        morse.put(".-.","r");
//        morse.put("...","s");
//        morse.put("-","t");
//        morse.put("..-","u");
//        morse.put("...-","v");
//        morse.put(".--","w");
//        morse.put("-..-","x");
//        morse.put("-.--","y");
//        morse.put("--..","z");

        String morseStr = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
                + "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
                + "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
                + "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
                + "'-.--':'y','--..':'z'";
        String[] morseArr = morseStr.split(","); //','로 배열 하나씩 나누기
        for (int i = 0; i < morseArr.length; i++) {
            morseArr[i] = morseArr[i].replace("'", "");//작은 따옴표 지우기
            int idx = morseArr[i].indexOf(":");//배열에 ':'를 index로
            morse.put(morseArr[i].substring(0, idx), morseArr[i].substring(idx+1));
            //배열당 첫번째 substring은 ':'앞을 키로, 그 뒤를 value로 put
        }

        for(String str : letters) answer += morse.get(str);
        return answer;
    }

    /**
     * 3. 가위 바위 보
     */
    public String solution3(String rsp){
        String answer = "";
        String[] rsps = rsp.split("");
        String rock = "0";
        String scissors = "2";
        String paper = "5";
        for(String str : rsps){
            if(str.equals(rock)) answer += paper;
            else if(str.equals(scissors)) answer += rock;
            else if(str.equals(paper)) answer += scissors;
        }
        return answer;
    }

    /**
     * 4. 구슬을 나누는 경우의 수
     */
    public int solution4(int balls, int share){
        return combination(balls, share);
    }

    /**
     * 이산함수... 조합... nCr...
     */
    public int combination(int n, int r){
        if(r == 0 || n == r){
            return 1;
        }else{
            return combination(n-1, r-1) + combination(n-1, r);
        }
    }

    public static void main(String[] args){
        Programmers8 programmers = new Programmers8();
        int result1 = programmers.solution1(999);
        System.out.println("1: "+result1);
        String result2 = programmers.solution2(".--. -.-- - .... --- -.");
        System.out.println("2: "+result2);
        String result3 = programmers.solution3("205");
        System.out.println("3: "+result3);
        int result4 = programmers.solution4(5,3);
        System.out.println("4: "+result4);
    }
}
