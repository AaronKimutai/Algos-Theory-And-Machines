import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReadStringsFromInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();

        while(input.hasNext()){
            String name = input.next();
            if(name.equals("Done")){
                break;
            }
            q.add(name);
        }
        int size = q.size();
        String [] names = new String[size];
        for(int i=0; i<size; i++){
            names[i] = q.remove();
        }
        System.out.println(Arrays.toString(names));
    }
}
