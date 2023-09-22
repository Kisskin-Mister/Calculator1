package com.kisskin.oop.calc;

public class ArabNum {
    int a;

    public int sum(int x, int y) {
        if (x >= 0 && x <= 10 && y >= 0 && y <= 10) {
            int result = x + y;
            return result;

        } else {
        return 1488;
        }
    }

    public int dif(int x, int y) {
        if (x >= 0 && x <= 10 && y >= 0 && y <= 10) {
            int result = x - y;
            return result;

        } else {
            return 1488;
        }
    }

    public int multi(int x, int y) {
        if (x >= 0 && x <= 10 && y >= 0 && y <= 10) {
            int result = x * y;
            return result;

        } else {
            return 1488;
        }
    }

    public int div(int x, int y) {
        if (x >= 0 && x <= 10 && y >= 0 && y <= 10) {
            int result = x * y;
            return result;

        } else {
            return 1488;
        }
    }


}
