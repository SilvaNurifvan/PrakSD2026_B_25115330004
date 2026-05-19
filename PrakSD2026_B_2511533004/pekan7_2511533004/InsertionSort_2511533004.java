package pekan7_2511533004;

public class InsertionSort_2511533004 {
	    public static void insertionSort_3004(int[] arr) {
	        int n_3004 = arr.length;
	        for (int i_3004 = 1; i_3004 < n_3004; i_3004++) {
	            int key_3004 = arr[i_3004];
	            int j_3004 = i_3004 - 1;
	            while (j_3004 >= 0 && arr[j_3004] > key_3004) {
	                arr[j_3004 + 1] = arr[j_3004];
	                j_3004--;
	            }
	            arr[j_3004 + 1] = key_3004;
	        }
	    }

	    public static void main(String[] args) {
	        int arr_3004[] = { 23, 78, 45, 8, 32, 56, 1 };
	        int n = arr_3004.length;
	        System.out.printf("array yang belum terurut:\n");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr_3004[i] + " ");
	        }
	        System.out.println("");
	        insertionSort_3004(arr_3004);
	        System.out.printf("array yang terurut:\n");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr_3004[i] + " ");
	        }
	        System.out.println("");
	    }
	}