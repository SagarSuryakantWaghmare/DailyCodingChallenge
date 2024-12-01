public class swapAlternative {
    public static void main(String[] args) {
        char[]a={'t','i','g','e','r'};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Swap alternative char:");
        for (int i = 0; i < a.length-1; i+=2) {
            char temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
