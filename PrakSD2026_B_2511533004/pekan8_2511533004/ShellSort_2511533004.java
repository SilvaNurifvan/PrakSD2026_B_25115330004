package pekan8_2511533004;

public class ShellSort_2511533004 {

    public static void shellSort_3004(int[] A_3004) {
        int n_3004 = A_3004.length;
        int gap_3004 = n_3004 / 2;

        while (gap_3004 > 0) {
            for (int i = gap_3004; i < n_3004; i++) {
                int temp = A_3004[i];
                int j = i;

                while (j >= gap_3004 && A_3004[j - gap_3004] > temp) {
                    A_3004[j] = A_3004[j - gap_3004];
                    j = j - gap_3004;
                }

                A_3004[j] = temp;
            }
            gap_3004 = gap_3004 / 2;
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

        System.out.print("Sebelum: ");
        printArray(data);
        shellSort_3004(data);

        System.out.print("Sesudah (Shell Sort): ");
        printArray(data);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}