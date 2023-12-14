public class binarySearch_1 {
    public static void main(String[] args) {
        int[] arr={2, 4, 6, 8, 9, 11, 15, 18, 21, 25};
        int n= arr.length;
        int mid=n/2-1;
        int target=21;
        //BInary Search in most Traditional way!
        for(int i=0;i<n;i++){
            if(target==arr[mid]){
                System.out.println("target reached at: "+mid);
            }
            else if(target>arr[mid]){
                for(int j=mid+1; j<n; j++){
                    if(target==arr[j]){
                        System.out.println("target reached at: "+j);
                    }
                }
            }
            else if(target<arr[mid]){
                for(int k=0;k<mid;k++){
                    if(target==arr[k]){
                        System.out.println("target reached at: "+ k);
                    }
                }
            }
            else{
                System.out.println("target not here!");
            }
        }

    }
    
}
