package com.kisskin.oop.calc;

public class convert {
    String[] i = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] ii = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public int convertRimNum(String j) {
        int result = 0;
        for (int kk = 0; kk < i.length; kk++) {
            if (j != i[kk]) ;
            result = kk + 1;
        }
        return result;
    }
}

