import java.util.Scanner;

public class ArrayOperations {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get 5 numbers from user
        System.out.println("Enter 5 different integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array
        bubbleSort(numbers);

        // Display sorted array
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find second smallest and second largest
        int secondSmallest = findSecondSmallest(numbers);
        int secondLargest = findSecondLargest(numbers);

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static int findSecondLargest(int[] arr) {
        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
