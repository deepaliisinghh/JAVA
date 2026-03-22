public class MoveZerosRight {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5};

        int index = 0;  // position for next non-zero element

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}