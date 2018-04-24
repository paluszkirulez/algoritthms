package pl.pi_rat.part1.main.lesson1.figuresdrawing;

public class drawRectangle {
    public static void main(String[] args) {
        doDrawRectangle(5);
    }
    public static void doDrawRectangle(int i){
        i = i-1;
        for(int x=0;x<=i;x++){
            for(int y=0;y<=i;y++){
                if(y==i || y == 0){
                    System.out.print("*");
                }
                else{
                    if(x==0 || x == i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
