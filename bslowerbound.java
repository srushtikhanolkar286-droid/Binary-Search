import java.util.List;
public class bslowerbound {
    public static int lowerbound(List<Integer> arr, int n, int x){
        int low =0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low+high)/2;
            if(ans[mid]>=x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
