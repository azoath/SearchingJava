public class searchInRange {
    public static void main(String[] args) {
        int[] arr={15, 16, 13, 18, 20, 25};
        System.out.println(searchnRange(arr,2,5,18));
    }

    static int searchnRange(int[] arr, int index1, int index2, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=index1; i<=index2; i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    
}
