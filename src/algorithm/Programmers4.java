package algorithm;

import java.util.Arrays;

public class Programmers4 {
    /**
     * 1. 옷가게 할인 받기
     */
    public int solution1(int price){
//        double answer = 0;
//        if(price >= 500000) answer = (double)price - ((double)price / 100) * 20;
//        else if (price >= 300000) answer = (double)price - ((double)price / 100) * 10;
//        else if (price >= 100000) answer = (double)price - ((double)price / 100) * 5;
//        return (int)answer;
        if(price >= 500000) price *= 0.8;
        else if(price >= 300000) price *= 0.9;
        else if(price >= 100000) price *= 0.95;
        return price;
    }

    /**
     * 2. 아이스 아메리카노
     */
    public int[] solution2(int money){
        int americano = 5500;
        int max = money/americano;
        return new int[]{max,money-(americano*max)};
    }

    /**
     * 3. 나이 출력
     */
    public int solution3(int age){
        return (2022-age)+1;
    }

    /**
     * 4. 배열 뒤집기
     */
    public int[] solution4(int[] num_list){
//        ArrayList<Integer> result = new ArrayList<>();
//        for(int i=num_list.length-1; i>=0; i--) result.add(num_list[i]);
//        return result.stream().mapToInt(Integer::intValue).toArray();
        int[] result = new int[num_list.length];
        for(int i=num_list.length-1; i>=0; i--){
            result[(num_list.length-1)-i] = num_list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Programmers4 programmers = new Programmers4();
        int result1 = programmers.solution1(135375);
        int[] result2 = programmers.solution2(15000);
        int result3 = programmers.solution3(40);
        int[] result4 = programmers.solution4(new int[]{1,0,1,1,1,3,5});
        System.out.println("1: "+result1);
        System.out.println("2: "+Arrays.toString(result2));
        System.out.println("3: "+result3);
        System.out.println("4: "+Arrays.toString(result4));
    }
}
