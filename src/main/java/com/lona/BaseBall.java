package com.lona;

public class BaseBall {
    //     스트라이크 카운트 메서드
    public static int strike(String resultNum, String tryNum, int countStrike) {
        for (int i = 0; i < resultNum.length(); i++) {
            if (resultNum.charAt(i) == tryNum.charAt(i)) {
                countStrike += 1;
            }
        }
        return countStrike;
    }

    //    볼 카운트 메서드
    public static int ball(String resultNum, String tryNum, int countBall) {

        String strBallCnt = "";
        int intBallCnt = 0;

        for (int i = 0; i < resultNum.length(); i++) {

            if (resultNum.indexOf(tryNum.charAt(i)) >= 0 && resultNum.charAt(i) != tryNum.charAt(i)) {
                strBallCnt += Integer.toString(i);
                intBallCnt = strBallCnt.length();
                countBall = intBallCnt;
            }
        }
        return countBall;
    }

}
