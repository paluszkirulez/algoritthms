package pl.pi_rat.part1.main.lesson2.datastructures;


public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] myList, boolean ascending) {

        int n = myList.length;

            do {
                for (int i = 0; i < n - 1; i++) {
                    if ((ascending ? myList[i] > myList[i + 1] : myList[i] < myList[i + 1]))
                             {
                        int a = myList[i];
                        myList[i] = myList[i + 1];
                        myList[i + 1] = a;

                    }
                }
                n = n - 1;
            } while (n > 1);



        for(int i: myList){
            System.out.print(i+ " ");
        }
    }
}
