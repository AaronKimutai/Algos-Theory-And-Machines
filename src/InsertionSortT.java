import java.util.Arrays;

public class InsertionSortT {
    public void sort(int[] a) {
        for (int i=1; i<a.length; i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args){
        int[]a = {31, 41, 59, 26, 41, 58};
        InsertionSortT n = new InsertionSortT();
        n.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
