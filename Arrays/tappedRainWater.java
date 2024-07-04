public class tappedRainWater {
    public static void main(String[] args) {

        int height[] = { 0,1,0,2,1,0,1,3,2,1,2,1 };
        TappingRainwater(height);

    }
    public static void TappingRainwater(int height[]) {
        int n = height.length;
        int Leftmax[] = new int[n];
        int RightMax[] = new int[n];

        // Leftemax
        Leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            Leftmax[i] = Math.max(Leftmax[i-1], height[i]);
        }

        RightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], height[i]);
        }
        int tappingWater = 0;
        int width =1;

        for(int j=0; j<n; j++){
            int waterlevel = Math.min(RightMax[j] , Leftmax[j] );
            tappingWater += (waterlevel - height[j]) *1;
 
        }
        // for (int i=0; i<n; i++){
        //     System.out.println(RightMax[i]);
        // }
        System.out.println("Total Amount of water is stored "+tappingWater);

    }

}
