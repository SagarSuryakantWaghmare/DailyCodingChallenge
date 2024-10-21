import java.util.ArrayList;
import java.util.List;

/**
 * summaryRanges
 */
public class summaryRanges {
    public static List<String> range(int[]arr){
        List<String> sRange=new ArrayList<>();
        if(arr.length==0||arr==null){
            return sRange;
        }
        int start=arr[0];
        int end=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==start+1){
                end=arr[i];
            }
            else{
                if(start==end){
                    sRange.add(String.valueOf(start));
                }
                else{
                    sRange.add(start+"->"+end);
                }
            }
            start=arr[i];
            end=arr[i];
        }
        if(start==end){
            sRange.add(String.valueOf(start));
        }
        else{
            sRange.add(start+"->"+end);
        }
        return sRange;
    }

    public static void main(String[] args) {
        int []arr={0,1,2,3,5,6,8,9,10};
        System.out.println(range(arr));
    }
}