import java.util.Scanner;

public class Sequential {

    public Scanner input = new Scanner(System.in);
    public int search(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] a = {1, 34, 65, 56, 78, 98, 100, 11, 22, 80};
        Sequential n = new Sequential();
       int result = n.search(a, 98);
       System.out.println(result);
    }
}
