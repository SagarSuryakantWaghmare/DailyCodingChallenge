public class NoOfBoquete {
    public static boolean isBlow(int day,int days[],int b,int r){
        int count=0;
        int bouq=0;
        for (int i = 0; i < days.length; i++) {
            if(days[i]<day){
                count++;
            }
            else{
                bouq+=count/r;
                count=0;
            }

        }
        bouq+=count/r;
        return bouq>=b;

    }
    public static int minDay(int day[],int b,int r){
        int n=day.length;
        if(n<b*r) return -1;
        int mini =Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini, day[i]);
            maxi=Math.max(maxi, day[i]);

        }
        int low=mini;
        int high=maxi;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(isBlow(mid,day,b,r)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int day[]={7,7,3,6,4,6,6,5,3,4};
        int b=2;
        int r=3;
        System.out.println(minDay(day,b,r));
    }
}