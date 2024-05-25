package com.lona.baseBall;

import java.util.Scanner;
public class BaseBall {
    //     스트라이크 카운트 메서드
    private static int strike(String resultNum, String tryNum, int countStrike) {
        for (int i = 0; i < resultNum.length(); i++) {
            if (resultNum.charAt(i) == tryNum.charAt(i)) {
                countStrike += 1;
            }
        }
        return countStrike;
    }

    //    볼 카운트 메서드
    private static int ball(String resultNum, String tryNum, int countBall) {

        StringBuilder strBallCnt = new StringBuilder();
        int intBallCnt;

        for (int i = 0; i < resultNum.length(); i++) {

            if (resultNum.indexOf(tryNum.charAt(i)) >= 0 && resultNum.charAt(i) != tryNum.charAt(i)) {
                strBallCnt.append(i);
                intBallCnt = strBallCnt.length();
                countBall = intBallCnt;
            }
        }
        return countBall;
    }

    public void playRun(){
        int[] nums = new int[3];
        int letter = nums.length;

        int countStrike = 0;
        int countBall = 0;

        String resultNum = "123";
        String tryNum;

        /* 게임 시작 */
        for (int i = 0; ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Given 123, Input ");
            tryNum = sc.next();

            int bcnt = ball(resultNum, tryNum, countBall);
            int scnt = strike(resultNum, tryNum, countStrike);

            if (tryNum.equals(resultNum)) {
                System.out.println(letter + "S");
            } else if (bcnt > 0 && scnt > 0) {
                System.out.println(scnt + "S" + bcnt + "B");
            } else if (bcnt > 0) {
                System.out.println(bcnt + "B");
            } else if (scnt > 0) {
                System.out.println(scnt + "S");
            } else {
                System.out.println("(null)");
            }
        }

    }

}
