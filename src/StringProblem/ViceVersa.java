package StringProblem;


public class ViceVersa {
    public static void main(String[] args) {
        String s = "AaaBbCCcd";
        System.out.println((int)'A');
        System.out.println(reverseOrderofChar(s));
    }

    private static String reverseOrderofChar(String s) {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
                char c = (char)(s.charAt(i) + 'A' - 'a');
                newS += c;
            }
            else{
                char c = (char)(s.charAt(i) + 'a' - 'A');
                newS += c;
            }
        }
        return newS;
    }
}
