
import java.util.Scanner;

public class InsertionSortBinarySearch {
     public static void main(String[] args) {
        int[] array = {45, 23, 42, 15, 78, 88, 100, 55, 72, 35, 12, 41, 16, 3, 11};

        System.out.println("Початковий масив:");
        printArray(array);

        insertionSort(array);

        System.out.println("Відсортований масив:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();
        scanner.close();

        int index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Число " + target + " знайдено на індексі " + index);
        } else {
            System.out.println("Число " + target + " не знайдено у масиві.");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
