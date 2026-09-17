import java.rmi.server.SocketSecurityException;

public class binarysearch {
    public static void main(String args[]){
        int[] arr ={0,1,2,3,4,5,6,7,8,9};
        int target = 6;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
    
}
