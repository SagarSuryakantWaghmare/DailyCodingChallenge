public class reverseCharArray {
    public static void reverse(char[]a){
        int i=0;
        int j=a.length-1;
        while (i<j) {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[]a={'t','i','g','e','r'};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse char:");
        reverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}