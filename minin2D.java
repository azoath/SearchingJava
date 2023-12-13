public class minin2D {
    public static void main(String[] args) {
        int[][] array={
            {22, 23, 45},
            {55, 21, 30},
            {15, 19, 20}
        };

        System.out.println("minimum value in the array is: "+minn2D(array));
    }

    static int minn2D(int [][] arr){
        int min= arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
}
