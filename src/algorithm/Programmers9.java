package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers9 {

    /**
     * 1. 점의 위치 구하기
     */
    public int solution1(int[] dot){
        int answer = 3;
        if(dot[0] > 0){
            if(dot[1] > 0) answer = 1;
            else answer = 4;
        }else if(dot[0] < 0 && dot[1] > 0) answer = 2;
        return answer;
    }

    /**
     * 2. 2차원으로 만들기
     */
    public int[][] solution2(int[] num_list, int n){
        int[][] answer = new int[num_list.length/n][n];
        for(int i=0; i<num_list.length/n; i++){
            for(int j=0, k=(i*n); j<n; j++, k++){
                answer[i][j] = num_list[k];
            }
        }
        return answer;
    }

    /**
     * 3. 공 던지기
     */
    public int solution3(int[] numbers, int k){
//        int answer = 0;
//        int count = 0;
//        for(int i=0; i<=k; i++){
//            if(i*2 >= numbers.length){
//                i = (i*2)-numbers.length;
//                k -= count;
//            }
//            answer = numbers[i*2];
//            count++;
//        }
//        return answer;

        int getBall = 1; //1부터 던짐
        for(int i=0; i<k-1; i++){ //index는 0부터 시작이므로 k-1
            getBall+=2; //다음을 건너뛰므로 +2씩
            if(getBall > numbers.length-1) getBall -= numbers.length;
            //마지막 index보다 크면 -length
        }
        return getBall;

//        return numbers[2*(k-1)%numbers.length];
    }

    /**
     * 4. 배열 회전시키기
     */
    public int[] solution4(int[] numbers, String direction){
//        int[] answer = new int[numbers.length];
//        int idx = numbers.length-1;
//
//        if(direction.equals("right")) answer[0] = numbers[idx];
//        else answer[idx] = numbers[0];
//
//        for(int i=0; i<numbers.length; i++){
//            if(direction.equals("right")&&i>0) answer[i] = numbers[i - 1];
//            else if(direction.equals("left")&&i!=idx) answer[i] = numbers[i + 1];
//        }
//        return answer;
        //자꾸 식을 쓰려고 해가지고;; 없는 수학머리에;;;

        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        //numbers를 list에 넣고
        if(direction.equals("right")){
            list.add(0, list.get(list.size()-1)); //0번째 index에 numbers 마지막 값을 넣고
            list.remove(list.size()-1); //나머지는 마지막 인덱스를 지움
            //[1,2,3] -> [3,1,2,3] -> [3,1,2]
        }else{
            list.add(list.size(), list.get(0)); //마지막 인덱스에 numbers 0번째 값을 넣고
            list.remove(0); //첫번째 인덱스 지움
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args){
        Programmers9 programmers = new Programmers9();
        int result1 = programmers.solution1(new int[]{-7,9});
        System.out.println("1: "+result1);
        int[][] result2 = programmers.solution2(new int[]{100,95,2,4,5,6,18,33,948},3);
        System.out.println("2: "+Arrays.deepToString(result2));
        int result3 = programmers.solution3(new int[]{1,2,3},4);
        System.out.println("3: "+result3);
        int[] result4 = programmers.solution4(new int[]{1,2,3},"right");
        System.out.println("4: "+Arrays.toString(result4));
    }
}
