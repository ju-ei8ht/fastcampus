package algorithm;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Programmers19 {

    /**
     * 1. 직사각형 넒이 구하기
     */
    public int solution1(int[][] dots){
//        double x1 = Math.pow(dots[1][0]-dots[0][0],2);
//        double y1 = Math.pow(dots[1][1]-dots[0][1],2);
//        int width = (int) Math.sqrt(x1+y1);
//        double x2 = Math.pow(dots[2][0]-dots[1][0],2);
//        double y2 = Math.pow(dots[2][1]-dots[1][1],2);
//        int height = (int) Math.sqrt(x2+y2);
//        return width*height;

        int minX=dots[0][0], minY=dots[0][1], maxX=dots[1][0], maxY= dots[1][1];
        for(int i=0; i<dots.length; i++){
            for(int j=0; j<dots[0].length; j++){
                if(j==0) {
                    if(minX > dots[i][j]) minX = dots[i][j];
                    else if(maxX < dots[i][j]) maxX = dots[i][j];
                }else{
                    if(minY > dots[i][j]) minY = dots[i][j];
                    else if(maxY < dots[i][j]) maxY = dots[i][j];
                }
            }
        }
        int width = maxX-minX;
        int height = maxY-minY;
        return width*height;
    }

    /**
     * 2. 캐릭터의 좌표
     */
    public int[] solution2(String[] keyinput, int[] board){
        int[] location = {0,0};
        for(String key:keyinput){
            if(key.equals("up") && location[1] < board[1]/2) location[1]++;
            else if(key.equals("down") && location[1] > -(board[1]/2)) location[1]--;
            else if(key.equals("left") && location[0] > -(board[0]/2)) location[0]--;
            else if(key.equals("right") && location[0] < board[0]/2) location[0]++;
        }
        return location;
    }

    /**
     * 3. 최댓값 만들기(2)
     */
    public int solution3(int[] numbers){
        Arrays.sort(numbers);
        if(numbers[0]*numbers[1] > numbers[numbers.length-2]*numbers[numbers.length-1]) return numbers[0]*numbers[1];
        return numbers[numbers.length-2]*numbers[numbers.length-1];
    }

    /**
     * 4. 다항식 더하기
     */
    public String solution4(String polynomial){
        String[] str = polynomial.split(" ");
        int x = -1;
        int n = -1;
        for(String s:str){
            if(s.contains("x")){
                if(Pattern.matches("^[0-9]+x*$",s)) s = s.replace("x","");
                else if(s.equals("x")) s = s.replace("x","1");
                x += Integer.parseInt(s);
            }else if(Pattern.matches("^[0-9]*$",s)){
                if(n == -1) n = 0; //0으로 입력되면 0출력돼야 함
                n += Integer.parseInt(s);
            }
        }
        if(x == -1 && n != -1) return String.valueOf(n); //숫자만 있는 경우
        if(x != 0) {
            if (n == -1) return (x+1) + "x"; //x만 있는 경우
        }else{  //x가 1일 경우 -> 1x 말고 x로 출력
            if(n == -1) return "x";
            else return "x + "+n;
        }
        return (x+1)+"x + "+n; //x가 1이 아닌 경우
    }

    public static void main(String[] args){
        Programmers19 programmers = new Programmers19();
        int result1 = programmers.solution1(new int[][]{{1,1},{2,1},{2,2},{1,2}});
        System.out.println("1: "+result1);
        int[] result2 = programmers.solution2(new String[]{"down", "down", "down", "down", "down"},new int[]{7,9});
        System.out.println("2: "+Arrays.toString(result2));
        int result3 = programmers.solution3(new int[]{1, -2});
        System.out.println("3: "+result3);
        String result4 = programmers.solution4("3x + 7 + x");
        System.out.println("4: "+result4);
    }
}
