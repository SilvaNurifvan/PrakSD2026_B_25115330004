package pekan8_2511533004;

public class QuickSort_2511533004 {

    static void swap(int[] arr_3004, int i_3004, int j_3004) {
        int temp_3004 = arr_3004[i_3004];
        arr_3004[i_3004] = arr_3004[j_3004];
        arr_3004[j_3004] = temp_3004;
    }

    // Metode tambahan untuk mengatur pivot menggunakan median-of-Three
    static void medianOfThree(int[] arr_3004, int low_3004, int high_3004) {
        int mid_3004 = low_3004 + (high_3004 - low_3004) / 2;

        // Urutkan elemen low, mid, dan high
        if (arr_3004[low_3004] > arr_3004[mid_3004]) {
            swap(arr_3004, low_3004, mid_3004);
        }
        if (arr_3004[low_3004] > arr_3004[high_3004]) {
            swap(arr_3004, low_3004, high_3004);
        }
        if (arr_3004[mid_3004] > arr_3004[high_3004]) {
            swap(arr_3004, mid_3004, high_3004);
        }

        swap(arr_3004, mid_3004, high_3004);
    }

    static int partition_2511533004(int[] arr_3004, int low_3004, int high_3004) {
        // Panggil fungsi medianOfThree sebelum menentukan pivot
        medianOfThree(arr_3004, low_3004, high_3004);

        int pivot_3004 = arr_3004[high_3004]; // sekarang arr[high] sudah berisi nilai median
        int i_3004 = (low_3004 - 1);

        for (int j_3004 = low_3004; j_3004 <= high_3004 - 1; j_3004++) {
            // jika elemen saat ini lebih kecil dari atau sama dengan pivot
            if (arr_3004[j_3004] < pivot_3004) {
                // increment indeks elemen yang lebih kecil
                i_3004++;
                swap(arr_3004, i_3004, j_3004);
            }
        }
        swap(arr_3004, i_3004 + 1, high_3004);
        return (i_3004 + 1);
    }

    static void quickSort_2511533004(int[] arr_3004, int low_3004, int high_3004) {
        if (low_3004 < high_3004) {
            int pi_3004 = partition_2511533004(arr_3004, low_3004, high_3004);

            quickSort_2511533004(arr_3004, low_3004, pi_3004 - 1);
            quickSort_2511533004(arr_3004, pi_3004 + 1, high_3004);
        }
    }

    public static void printArr_2511533004(int[] arr_3004) {
        for (int i_3004 = 0; i_3004 < arr_3004.length; i_3004++) {
            System.out.print(arr_3004[i_3004] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr_3004 = {10, 7, 8, 9, 1, 5};
        int N_3004 = arr_3004.length;

        System.out.print("Data sebelum diurutkan: ");
        printArr_2511533004(arr_3004);

        quickSort_2511533004(arr_3004, 0, N_3004 - 1);

        System.out.print("Data Terurut quicksort: ");
        printArr_2511533004(arr_3004);
    }
}