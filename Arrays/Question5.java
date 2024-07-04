public class Question5 {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(triplets(arr));
        
    }
    public static int triplets(int arr[]){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if( (arr[i] =arr[j] = arr[k]) ==0){
                       
                    }

                }
            }
        }
        return -1;
    }
}
