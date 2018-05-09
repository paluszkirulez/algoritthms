package pl.pi_rat.part1.main.lesson2.datastructures;

public class MainSort {
    public static void main(String[] args) {
        int[] myArray= new int[]{9,10,7,6,7,4,5,3,2,1};
        //int[] myArray = new int[0];
        new HeapSortMy().sort(myArray, true);


    }
}
