package pl.pi_rat.part1.main.lesson2.datastructures;

public class MainSort {
    public static void main(String[] args) {
        //int[] myArray= new int[]{10,9,8,6,7,4,5,3,2,1};
        int[] myArray = new int[0];
        SortAlgorithm one = new BubbleSortAlgorithm();
        one.sort(myArray,false);

    }
}
