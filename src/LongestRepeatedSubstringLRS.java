public class LongestRepeatedSubstringLRS {
    public String lrs(String a) {
        int start=0;
        int maxLength=0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j < a.length(); j++) {
                int x = i;
                int y = j;
                int length = 0;
                while (x<a.length() && y<a.length() && a.charAt(x)==a.charAt(y)){
                    length++;
                    x++;
                    y++;
                }
                if(length>maxLength){
                    maxLength = length;
                    start = i;
                }
            }
        }
        return a.substring(start, start+maxLength);
    }
    public static void main(String[] args){
        LongestRepeatedSubstringLRS n = new LongestRepeatedSubstringLRS();
        String a = n.lrs("Mississippi");
        System.out.println(a);
    }
}
