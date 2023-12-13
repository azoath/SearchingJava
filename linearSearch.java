public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1, 12, 16, 15, 18};
        //linearSearch(arr,15);
        System.out.println(linSearch(arr,25));
    }


    static int linSearch(int arr[], int target){
        if(arr.length==0){
            return -1;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
