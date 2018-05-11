package pl.pi_rat.part1.main.lesson1.codility_tests;

public class XtoYquick {
    public static void main(String[] args) {
        System.out.println(solution(10, 10, 30));
        //solution(10, 85, 30);
    }

    static public int solution(int X, int Y, int D) {
        double x = (double) X;
        double y = (double) Y;
        double d = (double) D;
        int resultD = (int) Math.ceil((y-x)/d);
        return resultD;
    }
}
