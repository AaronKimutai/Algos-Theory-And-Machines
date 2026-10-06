import java.util.Iterator;
import java.util.Scanner;

public class ST<key extends Comparable<key>, t> implements Iterable<key> {
    Node<key, t> root;

    public void put(key key, t t) {
        if (root == null) {
            root = new Node<>(key, t);
            return;
        }
        Node<key, t> current = root;
        while (current != null) {
            int c = key.compareTo(current.key);
            if (c < 0) {
                if (current.left == null) {
                    current.left = new Node<>(key, t);
                    break;
                } else {
                    current = current.left;
                }
            } else if (c > 0) {
                if (current.right == null) {
                    current.right = new Node<>(key, t);
                    break;
                } else {
                    current = current.right;
                }
            } else {
                break;
            }
        }
    }

    public boolean contains(key k) {
        if (root == null) {
            return false;
        } else {
            Node<key, t> current = root;
            while (current != null) {
                int c = k.compareTo(current.key);
                if (c == 0) {
                    return true;
                } else if (c > 0) {
                    if (current.right == null) {
                        return false;
                    } else {
                        current = current.right;
                    }
                } else if (c < 0) {
                    if (current.left == null) {
                        return false;
                    } else {
                        current = current.left;
                    }
                }
            }
        }
        return false;
    }

    public Iterator<key> iterator(){

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ST<String, Boolean> t = new ST<>();
        while(input.hasNext()){
            String k = input.next();
            if(!t.contains(k)){
                t.put(k, true);
            }
        }
        Iterator<String> b = t.iterator();
        while(b.hasNext()){
            String i = b.next();
            System.out.println(i);
        }
    }
}
