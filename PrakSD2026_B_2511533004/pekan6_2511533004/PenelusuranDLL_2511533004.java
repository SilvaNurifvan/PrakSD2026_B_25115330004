package pekan6_2511533004;
public class PenelusuranDLL_2511533004 {
    //fungsi penelusuran maju
    static void forwardTraversal_2511533004(NodeDLL_2511533004 head_3004) {
        // memulai penelusuran dari head
        NodeDLL_2511533004 curr_3004 = head_3004;
        //lanjutkan sampai akhir
        while (curr_3004 != null) {
            //print data
            System.out.print(curr_3004.data_3004 + " <-> ");
            //pindah ke node berikutnya
            curr_3004 = curr_3004.next_3004;
        }
        //print spasi
        System.out.println();
    }

    // fungsi penelusuran mundur
    static void backwardTraversal_2511533004(NodeDLL_2511533004 tail_3004) {
        // mulai dari akhir
        NodeDLL_2511533004 curr = tail_3004;
        //lanjut sampai head
        while (curr != null) {
            //cetak data
            System.out.print(curr.data_3004 + " <-> ");
            // pindah ke node sebelumnya
            curr = curr.prev_3004;
        }
        // cetak spasi
        System.out.println();
    }
    public static void main(String[] args) {
        // cetak DLL
        NodeDLL_2511533004 head_3004 = new NodeDLL_2511533004(1);
        NodeDLL_2511533004 second_3004 = new NodeDLL_2511533004(2);
        NodeDLL_2511533004 third_3004 = new NodeDLL_2511533004(3);

        head_3004.next_3004 = second_3004;
        second_3004.prev_3004 = head_3004;
        second_3004.next_3004 = third_3004;
        third_3004.prev_3004 = second_3004;

        System.out.println("Penelusuran maju:");
        forwardTraversal_2511533004(head_3004);

        System.out.println("Penelusuran mundur:");
        backwardTraversal_2511533004(third_3004);
    }
}