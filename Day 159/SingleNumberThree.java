/**
 * SingleNumberThree
 */
public class SingleNumberThree {
    public static int[] singleNumber(int []nums){
        int xor=0;
        for(int num:nums){
        xor^=num;
        }
        int diffBit=xor&-xor;
        int[]result=new int[2];
        for(int num:nums){
            if((num&diffBit)==0){
                result[0]=num;
            }
            else{
                result[1]=num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int []nums={1,2,5,2,1,8};
        int[]ans=singleNumber(nums);
        System.out.println("Single Number");
        for (int i : ans) {
            System.out.println(i);
        }
    }
}