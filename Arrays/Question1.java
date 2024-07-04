public class Question1 {

    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(repeat(nums));
    }
    public static boolean repeat(int arr[]){
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
           
        }
        return false;
    }
}

//Optimize version when i learn about hash map i will do it 

// import java.util.HashSet;

// public class Question1 {

//     public static void main(String[] args) {
//         int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//         System.out.println(repeat(nums));
//     }

//     public static boolean repeat(int arr[]) {
//         HashSet<Integer> seen = new HashSet<>();
//         for (int num : arr) {
//             if (seen.contains(num)) {
//                 return true;
//             }
//             seen.add(num);
//         }
//         return false;
//     }
// }
