package algorithm;

public class Programmers3 {
    /**
     * 1. 피자 나눠 먹기(1)
     */
    public int solution1(int n) {
        return n%7 == 0 ? n/7 : (n/7)+1;
    }

    /**
     * 2. 피자 나눠 먹기(2)
     */
    public int solution2(int n) {
        //유클리드 호제법으로 최소공배수 구하기
        int lcm = n*6/getGcd(n,6);
        return lcm/6;
    }
    public static int getGcd(int a, int b){
        return a%b == 0 ? b : getGcd(b, a%b);
    }

    /**
     * 3. 피자 나눠 먹기(3)
     */
    public int solution3(int slice, int n) {
        return n%slice == 0 ? n/slice : (n/slice)+1;
    }

    /**
     * 4. 배열의 평균값
     */
    public double solution4(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
        }
        return answer/numbers.length;
    }
    public static void main(String[] args) {
        Programmers3 programmers = new Programmers3();
        int result1 = programmers.solution1(7);
        int result2 = programmers.solution2(6);
        int result3 = programmers.solution3(7,10);
        double result4 = programmers.solution4(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("1: "+result1);
        System.out.println("2: "+result2);
        System.out.println("3: "+result3);
        System.out.println("4: "+result4);
    }
}
