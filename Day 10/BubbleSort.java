public class BubbleSort{
    static void bubbleSort(int[]a){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []a={7,4,8,2,10};
        bubbleSort(a);
        for (int i:a){
            System.out.print(i+" ");
        }
    }
}