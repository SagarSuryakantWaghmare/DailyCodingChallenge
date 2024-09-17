/**
 * countSubsets
 */
public class countSubsets {

    public static void main(String[] args) {
        String s="abc";
        int totalCount=countSubsets(s);
        System.out.println("Total subset:"+totalCount);
    }

    private static int countSubsets(String s) {
        int n=s.length();
        int TotalSubsetsCount=(int)Math.pow(2, n);
        return TotalSubsetsCount;
    }
}