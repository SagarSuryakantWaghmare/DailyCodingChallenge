public class findingMaxInOne {
    public static int findMaxRow(int arr[][]){
        int max=0;
        int row=0;
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==1){
                max=j;
                row=i;
                j--;
            }
            else{
                i++;
            }
        }
        return row;
    }

    public static void main(String[] args) {
        // Finding the maximum one's in  a row wise sorted matrix
        int arr[][]={{1,0,1},{0,0,1},{1,1,1}};
        System.out.println(findMaxRow(arr));
    }
}