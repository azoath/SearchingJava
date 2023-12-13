import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] array={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target= 8;
        int[] ans=search(array,target); 
        System.out.println("target available at: "+ Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    
    }
}
