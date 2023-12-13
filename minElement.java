public class minElement {
    public static void main(String[] args) {
        int[] array={12, 16, 13, -5, 19};
        System.out.println("minimun element of array is: "+ min(array));
    }

    static int min(int[] arr){
        int minValue= arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }  
        return minValue; 
        
    }
    
}
