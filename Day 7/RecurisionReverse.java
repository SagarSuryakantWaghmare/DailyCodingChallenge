import java.util.Scanner;

public class RecurisionReverse {
    // reversing the string :
    static String reverse(String s,int index){
        if(s.length()==index) return"";
        String smallAns=reverse(s, index+1);
        return smallAns+s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String s=sc.nextLine();
        System.out.println("Reverse string");
        System.out.println(reverse(s,0));
    }
}
