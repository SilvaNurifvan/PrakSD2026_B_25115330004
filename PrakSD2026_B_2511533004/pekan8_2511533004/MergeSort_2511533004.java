package pekan8_2511533004;

public class MergeSort_2511533004 {

    void Merge_2511533004(int arr_3004[], int l_3004, int m_3004, int r_3004) {

        int n1_3004 = m_3004 - l_3004 + 1;
        int n2_3004 = r_3004 - m_3004;

        int L_3004[] = new int[n1_3004];
        int R_3004[] = new int[n2_3004];

        for (int i_3004 = 0; i_3004 < n1_3004; ++i_3004)
            L_3004[i_3004] = arr_3004[l_3004 + i_3004];

        for (int j_3004 = 0; j_3004 < n2_3004; ++j_3004)
            R_3004[j_3004] = arr_3004[m_3004 + 1 + j_3004];

        int i_3004 = 0;
        int j_3004 = 0;
        int k_3004 = l_3004;

        while (i_3004 < n1_3004 && j_3004 < n2_3004) {
            if (L_3004[i_3004] <= R_3004[j_3004]) {
                arr_3004[k_3004] = L_3004[i_3004];
                i_3004++;
            } else {
                arr_3004[k_3004] = R_3004[j_3004];
                j_3004++;
            }
            k_3004++;
        }

        while (i_3004 < n1_3004) {
            arr_3004[k_3004] = L_3004[i_3004];
            i_3004++;
            k_3004++;
        }

        while (j_3004 < n2_3004) {
            arr_3004[k_3004] = R_3004[j_3004];
            j_3004++;
            k_3004++;
        }
    }

    void sort_2511533004(int arr_3004[], int l_3004, int r_3004) {
        if (l_3004 < r_3004) {

            int m_3004 = (l_3004 + r_3004) / 2;

            sort_2511533004(arr_3004, l_3004, m_3004);
            sort_2511533004(arr_3004, m_3004 + 1, r_3004);

            Merge_2511533004(arr_3004, l_3004, m_3004, r_3004);
        }
    }

    static void printArray_2511533004(int arr_3004[]) {
        int n_3004 = arr_3004.length;

        for (int i_3004 = 0; i_3004 < n_3004; ++i_3004)
            System.out.print(arr_3004[i_3004] + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        int arr_3004[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Sebelum terurut");
        printArray_2511533004(arr_3004);

        MergeSort_2511533004 ob_3004 = new MergeSort_2511533004();
        ob_3004.sort_2511533004(arr_3004, 0, arr_3004.length - 1);

        System.out.println("\nSesudah Terurut menggunakan Merge Sort");
        printArray_2511533004(arr_3004);
    }
}