public class ToLowerCase {
    public static String convertLowerCase(String str){
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                s.append((char)(str.charAt(i)+32));
            }
            else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str="Sagar can do it";
        System.out.println(convertLowerCase(str));
    }
}