import java.util.Scanner;

public class StrawStack {
   private String[] a;
   private int N = 0;
   public StrawStack(int max){
       a = new String[max];
   }
   public int size(){
       return N;
   }
   public void push(String item){
       a[N] = item;
       N++;
   }
   public String pop(){
       return a[--N];
   }
   public boolean isEmpty(){
       return N==0;
   }
   public static void main(String[] args){
       int max = Integer.parseInt(args[0]);
       StrawStack stack = new StrawStack(max);
       Scanner input = new Scanner(System.in);
       while(input.hasNext()){
           String item = input.next();
           if(item.equals("-")){
               System.out.println(stack.pop());
           }
           else {
               stack.push(item);
           }
       }
   }
}
