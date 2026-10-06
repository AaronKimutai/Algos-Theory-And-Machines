public class Node<key extends Comparable<key>, t>{
    key key;
    t t;
    Node<key, t> right;
    Node<key, t> left;
    public Node(key key, t t){
        this.key = key;
        this.t = t;
    }
}
