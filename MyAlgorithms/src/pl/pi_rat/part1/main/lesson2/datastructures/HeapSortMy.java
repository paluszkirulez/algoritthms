package pl.pi_rat.part1.main.lesson2.datastructures;

public class HeapSortMy implements SortAlgorithm {

    @Override
    public void sort(int[] array, boolean ascending) {
        int dlugoscTablicy = array.length;
        for(int i =dlugoscTablicy/2 - 1;i>=0;i--){
            budujKopiec(array, dlugoscTablicy,i);

        }

    }
    void budujKopiec(int tablica[], int dlugoscTablicy, int i){
        int largest =i;
        int left = 2*i+1;
        int right = 2*i+2;


        largest=((left < dlugoscTablicy && tablica[left]>tablica[largest]) ? left:largest);
        largest=((right < dlugoscTablicy && tablica[right]>tablica[largest]) ? right:largest);

        //if largest is root
       if(largest!=i){
           int temp = tablica[i];
           tablica[i]=tablica[largest];
           tablica[largest]=temp;
           budujKopiec(tablica,dlugoscTablicy,largest);
       }


    }
}
