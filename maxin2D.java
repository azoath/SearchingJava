public class maxin2D {
    public static void main(String[] args) {
        int[][] array={
            {22, 23, 45},
            {55, 21, 30},
            {15, 19, 20}
        };

        System.out.println("maximum element in the array is: "+ maxn2D(array));

    }

    static int maxn2D(int [][] arr){
        int max= arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }

}
