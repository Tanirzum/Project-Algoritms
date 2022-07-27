public class LinnerSearch {
    public static void main(String[] args) {

        int[] array = {2, 31, 543, 47, 87, 789, 7};
        int index = linearSearch(array, 87);
        printArray(index, 87);
    }

    public static int linearSearch(int[] array, int start) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == start) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int array, int value) {
        if (array == -1) {
            System.out.println("Ничего не найдено");
        } else {
            System.out.println(value + " Найдено элемент по индексом " + array);
        }
    }
}
