package algorithm;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Programmers20 {

    /**
     * 1. 숨어있는 숫자의 덧셈(2)
     */
    public int solution1(String my_string){
        int answer = 0;
        String[] str = my_string.split("");
        for(String s:str){
            if(Pattern.matches("^[a-zA-Z]*$",s)) my_string = my_string.replace(s,"x");
        }
        String[] str2 = my_string.split("x");
        for(String s:str2) if (!s.equals("")) answer += Integer.parseInt(s);
        return answer;
    }

    /**
     * 2. 안전지대
     */
    public int solution2(int[][] board){
//        int answer = 0;
//        for(int i=0; i<board.length; i++){
//            for(int j=0; j<board[0].length; j++){
//                if(board[i][j] == 0) answer++;
//                else{
//                    answer -= 8;
//                    if(j+1 < board[0].length && board[i][j+1] == 1) answer += 6;
//                    else if(i+1 < board.length && board[i+1][j] == 1) answer += 6;
//                }
//            }
//        }
//        if(answer < 0) return 0;
//        return answer; //와 모르겠다^^;;

        int answer = 0;
        int boomRange = 1;
        int[][] copyBoard = new int[board.length][board[0].length];

        int tempIndex = 0;
        for(int[] rows:board){
            copyBoard[tempIndex] = Arrays.copyOf(rows, board[tempIndex].length);
            tempIndex++;
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                int val = board[i][j];

                if(val == 0) continue;

                /*여기까진 그래, board를 copy한 다음에 element가 0이면(지뢰가 아니니까) 넘어가고
                * 지뢰면 copy한 board를 재분배
                * 재분배 끝나면 다시 for문 돌아가고 종료 후*/
                makeBoomArea(i, j, boomRange, copyBoard);

            }
        }

        /*최종적으로 여기서 copyboard의 elemet를 보고
        * 안전한 지역이면 결과값을 ++*/
        for(int[] ints:copyBoard){
            for(int anInt:ints){
                if(anInt == 0) answer++;
            }
        }
        return answer;
    }

    /*지뢰의 위치값(row,col)넣어주고
    * 지뢰 +-1 위치의 0인 애들이 배열 내에 있으면 위험한 애들이니까 그걸 선별해서
    * board에 해당 위치에 1로 넣어줌
    * 이 메서드가 끝나면 호출한 메서드로 넘어가고*/
    void makeBoomArea(int row, int col, int boomRange, int[][] board){
        for(int r=row-boomRange; r<=row+boomRange; r++){
            if(r < 0 || r >= board.length) continue;
            for(int c = col-boomRange; c<=col+boomRange; c++){
                if(c < 0 || c >= board[0].length) continue;

                board[r][c] = 1;
            }
        }
    }

    /**
     * 3. 삼각형의 완성조건(2)
     */
    public int solution3(int[] sides){
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        int lowLimit = max - min; //max가 가장 긴 변이라면
        int highLimit = max + min; //새로운 변이 가장 긴 변이라면

        return highLimit - lowLimit - 1; //나머지 한 변은 low초과 high미만이니까
    }

    /**
     * 4. 외계어 사전
     */
    public int solution4(String[] spell, String[] dic){
//        int answer = 2;
//        int cnt = 0;
//        first:
//        for(String d:dic){
//            for(String s:spell){
//                if(d.contains(s)) cnt++;
//                else continue first;
//            }
//            if(cnt==spell.length){
//                answer = 1;
//                break;
//            }else cnt=0;
//        }
//        return answer;

//        List<Character> words = Arrays.stream(spell).map(s -> s.charAt(0)).collect(Collectors.toList());
//
//        for(String str:dic){
//            if(str.length() < spell.length) continue;
//
//            Set<Character> spellSet = str.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
//
//            if(spellSet.containsAll(words)) return 1;
//        }
//        return 2;

        int answer = 2;
        for(String d:dic){
            boolean isTrue = true;
            for(String s:spell){
                if(!d.contains(s)){
                    isTrue = false;
                    break;
                }
            }

            if(isTrue){
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Programmers20 programmers = new Programmers20();
        int result1 = programmers.solution1("1a2b3c4d123Z");
        System.out.println("1: "+result1);
        int result2 = programmers.solution2(new int[][]{{0, 0, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 1, 0, 0, 0}});
        System.out.println("2: "+result2);
        int result3 = programmers.solution3(new int[]{1,2});
        System.out.println("3: "+result3);
        int result4 = programmers.solution4(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
        System.out.println("4: "+result4);
    }
}
