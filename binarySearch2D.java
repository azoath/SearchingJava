import java.util.Arrays;

public class binarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 }
        };
        int target = 49;
        System.out.println(Arrays.toString(binarySearch_2d(arr, target)));
    }

    static int[] binarySearch_2d(int[][] arr, int target) {

        int i = 0;
        int j = arr.length;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                return new int[] { i, j };
            }
            if (arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] { -1, -1 };
    }

}
