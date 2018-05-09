package pl.pi_rat.part1.main.lesson2.datastructures;

import java.util.function.BiFunction;

public class functionTry {
    public static void main(String[] args) {
        BiFunction<String, String,Integer> bi = (x, y) -> {
            return Integer.parseInt(x) + Integer.parseInt(y);
        };

        System.out.println(bi.apply("2", "3"));
    }
}
