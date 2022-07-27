public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {123, 3, 456, 7, 684776, 9879, 1, 967};

        for (int i = 0; i < array.length; i++) {
            printArrayToString(array);
            int index = printArray(array, i);

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static int printArray(int[] arr, int start) {
        int minValue = arr[start];
        int minIndex = start;

        for (int i = start; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArrayToString(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}

