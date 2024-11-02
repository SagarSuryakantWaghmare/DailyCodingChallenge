import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class IntersectionOfTwoArraysTwo {
    public static int[] intersect(int []nums1,int []nums2){
        HashMap<Integer,Integer>mp=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int num:nums1){

                mp.put(num, mp.getOrDefault(num, 0)+1);

        }
        for(int num:nums2){
            if(mp.containsKey(num)&&mp.get(num)>0){
                res.add(num);
                mp.put(num, mp.get(num)-1);
            }
        }
        int []result=new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
        
    }

    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        int res[]=intersect(nums1,nums2);
        System.out.println("Intersection of two arrays is: ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}