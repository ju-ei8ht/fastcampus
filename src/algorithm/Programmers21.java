package algorithm;

import java.util.HashSet;
import java.util.Set;

public class Programmers21 {

    /**
     * 1. 저주의 숫자 3
     */
    public int solution1(int n){
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i == 3) answer++;
            answer++;
            if(answer/10 == 3 || answer/10 == 13) answer += 10; //30, 130
            else if(answer%3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
                if(String.valueOf(answer).contains("3") || answer%3 == 0) answer++;
            }
        }
        return answer;
    }

    public int solution2(int[][] dots){
//        int x = dots[0][0];
//        int y = dots[0][1];
//        int[] xList = new int[dots.length];
//        int[] yList = new int[dots.length];
//        for(int i=0, j=1; i<dots.length; i++, j++){
//            xList[i] = dots[j][0]-x;
//            yList[i] = dots[j][1]-y;
//        }
//        for(int xx:xList){
//            if(x+xx == )
//        }
        return 0; //아 모르겠다...
    }

    /**
     * 4. 유한소수 판별하기
     */
    public int solution4(int a, int b){
        int answer = 1;
        Set<Integer> set = new HashSet<>();
        int gcd = getGcd(a,b);
        b = b/gcd;
        for(int i=2; i<=Math.sqrt(b); i++){
            while (b%i == 0){
                set.add(i);
                b /= i;
            }
        }
        if(b != 1) set.add(b);
        for(Integer result:set){
            if(result != 2 && result != 5){
                answer = 2;
                break;
            }
        }
        return answer;
    }
    static int getGcd(int a, int b){
        return a%b==0 ? b : getGcd(b, a%b);
    }

    public static void main(String[] args){
        Programmers21 programmers = new Programmers21();
        int result1 = programmers.solution1(131);
        System.out.println("1: "+result1);
        int[][] test1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int result2 = programmers.solution2(test1);
        System.out.println("2: "+result2);
        int result4 = programmers.solution4(12,21);
        System.out.println("4: "+result4);
    }
}
