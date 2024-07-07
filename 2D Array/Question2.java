public class Question2 {
    public static void main(String[] args) {
        int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        int key =1;
        int sum =0;
        for(int i = 0; i<nums[0].length; i++){
            sum += nums[key][i];
        }
        System.out.println(sum);
    
    
    }

}
