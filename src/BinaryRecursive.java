public class BinaryRecursive {
    public int binaryRec(int[]a, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(a[mid]==target){
            return mid;
        }
        if(a[mid]<target){
            return binaryRec(a, low + 1, high, target);
        }
        return binaryRec(a, low, mid -1, target);
    }
    public static void main(String[] args){
        BinaryRecursive n = new BinaryRecursive();
        int []a = {1, 11, 22, 34, 56, 65, 78, 80, 98, 100};
        int result = n.binaryRec(a, 0, 9, 22);
        System.out.println(result);
    }
}
