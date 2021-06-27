package com.company;

public class Main {

    public static void main(String[] args) {
        /* n1
        System.out.println(n1(5));
        System.out.println(n1(3));
        System.out.println(n1(2));
         */

        /* n2
        System.out.println(n2(13, 12));
        System.out.println(n2(17, 12));
        System.out.println(n2(38, 8));
         */

        /* n3
        System.out.println(n3(5));
         */

        /* n4
        System.out.println(n4(5));
        System.out.println(n4(-55));
        System.out.println(n4(37));
         */

        /* n5
        System.out.println(n5(true, false));
        System.out.println(n5(true, true));
        System.out.println(n5(false, true));
        System.out.println(n5(false, false));
         */

        /* n6
        System.out.println(n6(54, 1, 43));
        System.out.println(n6(46, 5, 4));
        System.out.println(n6(100, 4, 5));
        System.out.println(n6(10, 15, 12));
        System.out.println(n6(41, 3, 6));
         */

        /* n7
        System.out.println(squaed(5));
        System.out.println(squaed(9));
        System.out.println(squaed(100));
         */

        /* n8
        System.out.println(n8(0.2, 50, 9));
        System.out.println(n8(0.9, 1, 2));
        System.out.println(n8(0.9, 3, 2));
         */

        /* n9
        System.out.println(n9(1, 1));
        System.out.println(n9(10, 1));
        System.out.println(n9(10, 25));
         */

        /* n10
        System.out.println(n10(5, 2));
        System.out.println(n10(218, 5));
        System.out.println(n10(6, 3));
         */
    }

    public static int n1(int p1) {
        return p1 * 60;
    }

    public static int n2(int p21, int p22) {
        return (p21 * 2) + (p22 * 3);
    }

    public static int n3(int p31, int p32, int p33) {
        return (p31 * 3) + (p32 * 1) + (p33 * 0);
    }

    public static boolean n4(int p4) {
        if (p4 % 5 == 0)
            return true;
        else
            return false;
    }

    public static boolean n5(boolean p51, boolean p52) {
        return p51 && p52;
    }

    public static int n6(int p61, int p62, int p63) {
        return p61 / (p62 * p63);
    }

    public static int squaed(int a) {
        return a * a;
    }

    public static boolean n8(double prob, int prize, int pay) {
        if (prob * prize > pay)
            return true;
        else
            return false;
    }

    public static int n9(int p91, int p92) {
        return p91 * p92 * 60;
    }

    public static int n10(int p101, int p102) {
        return p101 - p101 / p102 * p102;
    }

}
