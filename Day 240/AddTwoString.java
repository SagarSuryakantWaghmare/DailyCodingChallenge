import java.math.BigInteger;

public class AddTwoString{
    public static String addTwoString(String s1,String s2){
        BigInteger n1=new BigInteger(s1);
        BigInteger n2=new BigInteger(s2);
        BigInteger sum=n1.add(n2);
        return sum.toString();
    }
    public static  void main(String[]args){
     String s1="39";
     String s2="32";
     System.out.println(addTwoString(s1,s2));

    }
}