public class LinkedListP {
    private LinkedListP next;
    public String name;
    public String item;
    public LinkedListP first;
    public String deleteFirst(){
        item = first.name;
        first = first.next;
        return item;
    }
    public void addNode(String item){
       LinkedListP oldFirst = first;
       first = new LinkedListP();
       first.name = item;
       first.next = oldFirst;

    }
    public void traverse(){
        LinkedListP x = first;
        while (x !=null){
            System.out.println(x.name);
            x = x.next;
        }
    }
    public static void main(String[] args) {
        LinkedListP list = new LinkedListP();
        list.addNode("Aaron");
        list.addNode("Alice");
        list.addNode("Bob");
        list.traverse();
        list.deleteFirst();
        list.traverse();
    }
}
