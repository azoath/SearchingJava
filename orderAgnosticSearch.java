public class orderAgnosticSearch {
    public static void main(String[] args) {
        int arr[]={2, 6, 9, 11, 16, 19, 24, 30};
        int[] arr2={30, 22, 19, 17, 15, 9, 5, 1};

        int target=19;

        System.out.println("in ascending order: "+orderAgnostic_Search(arr, target));
        System.out.println("in descending order: "+orderAgnostic_Search(arr2, target));
    }



    static int orderAgnostic_Search(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;
        int start_element=arr[0];
        int end_element=arr[arr.length-1];

        while(start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
        
        
        //Descending order of sorting
        if(start_element>=end_element){
            
            if(target>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        //Ascending order of sorting
        else{
            
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        
       } 
       return -1;

    }
    
}
