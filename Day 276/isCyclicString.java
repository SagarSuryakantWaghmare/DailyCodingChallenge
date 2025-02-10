public class isCyclicString {
    public static int isCyclicRotation(String p, String q) {
        return (p.length() == q.length() && (p + p).contains(q)) ? 1 : 0;
    }
    public static void main(String[] args) {
        String p = "abcde";
        String q = "cdeab";
        System.out.println(isCyclicRotation(p, q)); 

        String r = "abcde";
        String s = "abced";
        System.out.println(isCyclicRotation(r, s)); 
    }
}
