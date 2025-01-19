public class Book_allocation {
    public static void main(String[] args) {
        int arr[] = {25, 46, 28, 49, 24};
        int student = 4;
        System.out.println(book_Allocation(arr , student));

    }

    static int book_Allocation(int arr[], int m) {
        int low = maxi(arr);
        int high = sumOf(arr);
        int ans = -1;
        while (low <= high){
            int mid = (low +high)/2;
            int noOfStudent =cntStudents(arr, mid);
            if (noOfStudent > m){

                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return low;
    }

    private static int cntStudents(int[] arr, int i) {
        int cntpages = 0;
        int student = 1;
        for (int j = 0; j < arr.length; j++) {
            if (cntpages + arr[j] <= i) {
                cntpages += arr[j];
            } else {
                student++;
                cntpages = arr[j];
            }
        }
        return student;
    }

    static int sumOf(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    static int maxi(int arr[]) {
        int low = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            low = Math.max(low, arr[i]);
        }
        return low;
    }
}
