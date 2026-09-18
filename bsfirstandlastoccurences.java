public class bsfirstandlastoccurences {
    public static int findFirst(int[] arr, int x){
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int first = -1;
        while(high>=low){
            int mid = low +( high - low )/2;
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return first;
    }
    public static int findLast(int[] arr, int x){
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int last = -1;
        while(high>=low){
            int mid = low +( high - low )/2;
            if(arr[mid] == x){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return last;
    }
    public static int[] firstAndLastPosition(int[] arr,  int k) {
        int first = findFirst(arr, k);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last = findLast(arr, k);
        return new int[]{first,last};
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;
        int[] values = firstAndLastPosition(arr,x);
        System.out.println("First occurrence of " + x + " is at index: " + values[0]);
            System.out.println("Last occurrence of " + x + " is at index: " + values[1]);
    }
}
