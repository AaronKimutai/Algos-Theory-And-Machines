import java.util.Scanner;
import java.util.Stack;

public class PostScript {
    static Stack<Double> v = new Stack<>();
    public static void add(){
        v.push(v.pop()+v.pop());
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String x = input.next();
            if(x.equalsIgnoreCase("Done")){
                break;
            }
            if(x.equalsIgnoreCase("add")){
                add();
            }
            else{
                v.push(Double.parseDouble(x));
            }
            }
        System.out.println(v.pop());
    }
}
