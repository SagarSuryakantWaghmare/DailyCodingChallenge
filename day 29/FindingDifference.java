

public class FindingDifference {
    static char DifferenceInString(String s,String t){
        char difference=0;
        for(int i=0;i<s.length();i++){
            difference^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            difference^=t.charAt(i);
        }
        return difference;
    }
  public static void main(String[] args) {
   String s="sagar";
   String t="sagars";
   System.out.println("Difference :"+DifferenceInString(s,t));
  }  
}
