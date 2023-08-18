public class App {
    public static void main(String[] args) {
        int ar[] = { 1, 3, 5, 7, 9 };
        int target = 9;
        int index = binarySearch(ar, target);
        if (index != 0) {
            System.out.println(target + " ditemukan pada array ke " + index);
        } else {
            System.out.println(target + " tidak ditemukan");
        }
    }

    public static int binarySearch(int ar[], int target) {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ar[mid] < target) {
                low = mid + 1;
            } else if (ar[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}