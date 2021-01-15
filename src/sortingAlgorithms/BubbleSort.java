package sortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {3, 2, -1, 5, 4};

        for (int i = 0; i < a.length - 1; i++) {
            boolean sorted =true;
            for (int j = 0; j < a.length -1 -i; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    sorted =false;
                }
                if(sorted){
                    break;
                }
            }

        }
        for(int item: a){
            System.out.print(item + "  ");
        }
//        for(int i =0;i< a.length;i++){
//            if(a[i+1]<a[i]){
//                int temp;
//                temp = a[i+1];
//                a[i] = a[i+1];
//                a[i+1]= temp;
//
//            }
//        }
    }
}
