package utils;

import java.util.Random;

public class Minha {
    public static void saida(String msg) {
        System.out.println(msg);
    }

    public static int aleatorio(int max) {

        int aleatorio = 0;

        for (int i = 0; i < max; i++) {
            aleatorio += new Random().nextInt(9) * Math.pow(10, i);
        }
        if (aleatorio < 0) {
            return aleatorio * -1;
        }
        return aleatorio;

    }
}
