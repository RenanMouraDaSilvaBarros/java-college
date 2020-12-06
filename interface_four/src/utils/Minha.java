package utils;

import java.util.Random;

public class Minha {
    public static void saida(String msg) {
        System.out.println(msg);
    }

    public static int aleatorio(int max) {

        int number = new Random().nextInt();
        int aleatorio = 0;

        for (int i = 0; i < max; i++) {
            aleatorio += number;
        }

        return aleatorio;

    }
}
