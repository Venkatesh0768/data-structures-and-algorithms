import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Ksnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[weight.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int currentweight = w;
        int finalval = 0;

        for (int i = val.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (currentweight >= weight[idx]) {
                finalval += val[idx];
                currentweight -= weight[idx];
            } else {
                finalval += (ratio[i][1] * currentweight);
                currentweight = 0;
                break;
            }
        }

        System.out.println(finalval);

    }
}
