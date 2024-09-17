import java.util.Scanner;

public class CharRemoveRecurrsive {
    static String removeOccurence(String s,int index ){
        if(index==s.length()) return "";
        String smallAns=removeOccurence(s, index+1);
        char currChar=s.charAt(index);
        if(currChar!='a'){
            return currChar+smallAns;
        }else{
            return smallAns;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        removeOccurence( s, 0);
    }
}