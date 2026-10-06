import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluation {
    public static void main(String[] args){
        Stack<Double> ar = new Stack<>();
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String n = input.next();
            if(n.equalsIgnoreCase("Done")){
                break;
            }
           if(n.equals("*")){
               ar.push(ar.pop() *ar.pop());
           }
           else if(n.equals("+")){
               ar.push(ar.pop()+ar.pop());
           }
           else if(n.equals("-")){
               double right = ar.pop();
               double left = ar.pop();
               ar.push(left-right);
           }
           else if(n.equals("/")){
               double right = ar.pop();
               double left = ar.pop();
               ar.push(left/right);
           }
           else{
               ar.push(Double.parseDouble(n));
           }
        }
        System.out.println(ar.pop());
    }
}
