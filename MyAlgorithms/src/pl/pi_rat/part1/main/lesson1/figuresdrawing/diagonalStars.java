package pl.pi_rat.part1.main.lesson1.figuresdrawing;

public class diagonalStars {
    public static void main(String[] args) {
        drawDiagonal(5);
    }
    public static void drawDiagonal(int i){
        for(int x=0;x<=i;x++){
            for(int y=0;y<=x;y++){
                if(y==x){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
