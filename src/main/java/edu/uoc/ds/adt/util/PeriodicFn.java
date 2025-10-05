package edu.uoc.ds.adt.util;

public class PeriodicFn {
    public static int LEN = 15;
    public static boolean f(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
