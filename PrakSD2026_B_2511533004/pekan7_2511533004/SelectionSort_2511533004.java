package pekan7_2511533004;

public class SelectionSort_2511533004 {
	    public static void selectionSort_3004(int[] arr) {
	        int n_3004 = arr.length;
	        for (int i_3004 = 0; i_3004 < n_3004; i_3004++) {
	            int minIndex_3004 = i_3004;
	            for (int j_3004 = i_3004 + 1; j_3004 < n_3004; j_3004++) {
	                if (arr[j_3004] < arr[minIndex_3004]) {
	                    minIndex_3004 = j_3004;
	                }
	            }
	            int temp = arr[i_3004];
	            arr[i_3004] = arr[minIndex_3004];
	            arr[minIndex_3004] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int arr_3004[] = { 23, 78, 45, 8, 32, 56, 1 };
	        int n_3004 = arr_3004.length;
	        System.out.printf("array yang belum terurut:\n");
	        for (int i = 0; i < n_3004; i++) {
	            System.out.print(arr_3004[i] + " ");
	        }
	        System.out.println("");
	        selectionSort_3004(arr_3004);
	        System.out.printf("array yang terurut:\n");
	        for (int i = 0; i < n_3004; i++) {
	            System.out.print(arr_3004[i] + " ");
	        }
	        System.out.println("");
	    }
	}
