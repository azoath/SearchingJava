import java.util.Arrays;

public class LinearSearch2D {
    public static void main(String[] args) {

        int[][] array = {
                { 1, 2, 3 },
                { 5, 9, 12 },
                { 13, 15, 30 }
        };
        int target = 15;

        System.out.println(Arrays.toString(linear2D(array, target)));

    }

    static int[] linear2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
