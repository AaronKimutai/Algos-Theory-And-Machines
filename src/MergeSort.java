import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }
        while (j <= high) {
                temp[k] = a[j];
                j++;
                k++;
        }
        for (int x = 0; x < temp.length; x++) {
                a[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        MergeSort n = new MergeSort();
        int[] a = {1, 34, 65, 56, 78, 98, 100, 11, 22, 80
        };
        n.mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
