package com.lona;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
        int letter = nums.length;

        int countStrike = 0;
        int countBall = 0;

        String resultNum = "123";
        String tryNum = "";

        /* 게임 시작 */
        for (int i = 0; ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Given 123, Input ");
            tryNum = sc.next();

            int bcnt = BaseBall.ball(resultNum, tryNum, countBall);
            int scnt = BaseBall.strike(resultNum, tryNum, countStrike);

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