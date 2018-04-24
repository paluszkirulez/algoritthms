package pl.pi_rat.part1.main.lesson1.figuresdrawing;

public class DrawTriangle {
    public static void main(String[] args) {
        draw(6);
    }

    static void draw(int x) {
        //for (int i = 1; i <= x; i++) {
            drawLine(x);
            System.out.println();

        //}

    }
    static void drawLine(int x){
        if (x > 0) {
            System.out.print("*");
            draw(x - 1);
        }

    }
}
