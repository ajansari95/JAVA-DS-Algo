package sortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 2, -1, 6, 3};
        for (int i = 0; i < a.length -1; i++) {
            int minInd = i;
            for (int j = i; j < a.length; j++) {
                if (a[j]<a[minInd]) {
                    minInd =j;
                }

            int temp = a[i];
                a[i] = a[minInd];
                a[minInd] = temp;
            }
        }

        for(int item:a){
            System.out.print(item + " ");
        }

    }
}
