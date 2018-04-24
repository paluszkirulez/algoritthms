package pl.pi_rat.part1.main.lesson1.figuresdrawing;

public class drawX {
    public static void main(String[] args) {
        doDrawX(5);
    }
    public static void doDrawX(int i){
        i=i-1;
        for(int x=0;x<=i;x++){
            for(int y=0;y<=i;y++){
                if(y==x || y == i-x){
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
