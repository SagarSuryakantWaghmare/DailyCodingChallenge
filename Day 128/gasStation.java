/**
 * gasStation
 */
public class gasStation {
    public static int canComplete(int[]gas,int[]cost){
        int gasRemain=0;
        int total=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            int remain=gas[i]-cost[i];
            if(gasRemain>=0){
                gasRemain+=remain;
            }
            else{
                gasRemain=remain;
                start=i;
            }
            total+=remain;
        }
        if(total>=0){
            return start;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        System.out.println(canComplete(gas,cost));
    }
}