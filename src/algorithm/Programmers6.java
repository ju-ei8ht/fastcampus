package algorithm;

public class Programmers6 {

    /**
     * 1. 특정 문자 제거하기
     */
    public String solution1(String my_string, String letter){
        String[] str = my_string.split("");
        String answer = "";
        for(int i=0; i<str.length; i++){
            if(str[i].equals(letter)) continue;
            answer += str[i];
        }
        return answer;
    }

    /**
     * 2. 각도기
     */
    public int solution2(int angle){
        if(angle == 180) return 4;
        else if(angle > 90 && angle < 180) return 3;
        else if(angle == 90) return 2;
        return 1;
    }

    /**
     * 3. 양꼬치
     */
    public int solution3(int n, int k){
        k -= n/10;
        return (n*12000)+(k*2000);
    }

    /**
     * 4. 짝수의 합
     */
    public int solution4(int n){
        int answer = 0;
        for(int i=0; i<n+1; i++) if (i % 2 == 0) answer += i;
        return answer;
    }
    public static void main(String[] args){
        Programmers6 programmers = new Programmers6();
        String result1 = programmers.solution1("abcdef","f");
        System.out.println("1: "+result1);
        int result2 = programmers.solution2(180);
        System.out.println("2: "+result2);
        int result3 = programmers.solution3(64,6);
        System.out.println("3: "+result3);
        int result4 = programmers.solution4(4);
        System.out.println("4: "+result4);
    }
}
