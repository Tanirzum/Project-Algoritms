import java.util.Arrays;

public class InnerSort {
    public static void main(String[] args) {

        int[] array = {8, 5, 7, 3, 9, 2, -1};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int a = i;
            while (a > 0 && arr[a - 1] > temp) {
                arr[a] = arr[a - 1];
                a--;
            }
            arr[a] = temp;
        }
    }
}