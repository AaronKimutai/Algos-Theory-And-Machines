public class Binary {
    public int binarySearch(int[]a, int target) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return mid;
            }
            if (a[mid] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = {1, 11, 22, 34, 56, 65, 78, 80, 98, 100 };
        Binary n = new Binary();
        int result = n.binarySearch(a, 22);
       System.out.println(result);
    }
}
