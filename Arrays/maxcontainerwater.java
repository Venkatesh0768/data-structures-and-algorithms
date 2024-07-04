public class maxcontainerwater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int max = maxContainer(height);
        System.out.println(max);
    }

    public static int maxContainer( int height[]){
        int max=0;
        for(int i =0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int breath = Math.abs(j-i);
                System.out.print(breath + " ");
                int length = Math.min(height[i] , height[j]);
                System.out.print(length + " ");
                int area = breath * length;
                max =Math.max(area, max);
            }
        }

        return max;
    }

}
