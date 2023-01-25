package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class Programmers2 {

    /**
     *1. 나머지 구하기
     */
    public int solution1(int num1, int num2) {
        return num1%num2;
    }

    /**
     *2. 중앙값 구하기
     */
    public int solution2(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    /**
     *3. 최빈값 구하기
     */
    public int solution3(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<array.length; i++){
            hm.put(array[i], hm.getOrDefault(array[i], 0)+1);
        }
        List<Map.Entry<Integer, Integer>> entries = hm.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());
        return entries.size() > 1 && entries.get(0).getValue() == entries.get(1).getValue() ?
                -1 : entries.get(0).getKey();
    }

    /**
     *4. 짝수는 싫어요
     */
    public int[] solution4(int n) {
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<n+1; i++) if (i % 2 == 1) odd.add(i);
        return odd.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        Programmers2 programmers = new Programmers2();
        int result1 = programmers.solution1(3,2);
        int result2 = programmers.solution2(new int[]{1,2,7,10,11});
        int result3 = programmers.solution3(new int[]{1,2,3,3,3,4});
        int[] result4 = programmers.solution4(10);
        System.out.println("1: "+result1);
        System.out.println("2: "+result2);
        System.out.println("3: "+result3);
        System.out.println("4: "+Arrays.toString(result4));
    }
}
