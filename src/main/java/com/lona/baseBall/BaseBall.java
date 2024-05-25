package com.lona.baseBall;

public class BaseBall {
    private final static int TRY_COUNT = 3;

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

    public String getScore(String given, String input) {
        int letter = TRY_COUNT;
        /* 게임 시작 */
        int countBall = 0;
        int countStrike = 0;

        System.out.print("Given " + given + ",");
        System.out.print("Input " + input);
        int bcnt = ball(given, input, countBall);
        int scnt = strike(given, input, countStrike);

        if (given.equals(input)) {
            return letter + "S";
        } else if (bcnt > 0 && scnt > 0) {
            return scnt + "S" + bcnt + "B";
        } else if (bcnt > 0) {
            return bcnt + "B";
        } else if (scnt > 0) {
            return scnt + "S";
        }

        return null;
    }


}
