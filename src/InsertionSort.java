import java.util.Arrays;

public class InsertionSort {
    public void sort(int[]a, int i){
        int key = a[i];
        int j = i-1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
    }
    public static void main(String[] args){
        int[]a = {1, 2, 3, 5, 4};
        InsertionSort n = new InsertionSort();
        n.sort(a, 4);
        System.out.println(Arrays.toString(a));
    }
}
