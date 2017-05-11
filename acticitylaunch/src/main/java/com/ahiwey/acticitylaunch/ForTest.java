package com.ahiwey.acticitylaunch;

/**
 * Created by ahiwey on 2017/5/3.
 */

public class ForTest {

    public static void main(String[] args) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 3); foo('C')) {
            i++;
            foo('D');
        }
    }

    private static boolean foo(char c) {

        System.out.print(c + " ");
        return true;
    }
}