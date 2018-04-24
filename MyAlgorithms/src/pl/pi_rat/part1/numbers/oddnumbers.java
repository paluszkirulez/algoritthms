package pl.pi_rat.part1.numbers;

public class oddnumbers {
    public static void main(String[] args) {
        /*for(int i =1;i<=61;i=i+2){
            System.out.println(i);
        }*/
        for(int i =1;i<=61;i=i+2){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
