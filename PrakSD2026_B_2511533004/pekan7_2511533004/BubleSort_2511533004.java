package pekan7_2511533004;

public class BubleSort_2511533004 {
	    public static void bubbleSort_3004(int[] arr) {
	        int n_3004 = arr.length;
	        for (int i_3004 = 0; i_3004 < n_3004; i_3004++) {
	            for (int j_3004 = 0; j_3004 < n_3004 - i_3004 - 1; j_3004++) {
	                if (arr[j_3004] > arr[j_3004 + 1]) {
	                    int temp_3004 = arr[j_3004];
	                    arr[j_3004] = arr[j_3004 + 1];
	                    arr[j_3004 + 1] = temp_3004;
	                }
	                // System.out.println("data:"+arr[j]+" "+arr[j+1]);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int arr_3004[] = { 23, 78, 45, 8, 32, 56, 1 };
	        int n_3004 = arr_3004.length;
	        System.out.print("array yang belum terurut:");
	        for (int i = 0; i < n_3004; i++) {
	            System.out.print(arr_3004[i] + " ");
	        }
	        System.out.println("");
	        bubbleSort_3004(arr_3004);
	        System.out.print("array yang terurut menggunakan BubleSort:");
	        for (int i = 0; i < n_3004; i++) {
	            System.out.print(arr_3004[i] + " ");
	        }
	        System.out.println("");
	    }
	}