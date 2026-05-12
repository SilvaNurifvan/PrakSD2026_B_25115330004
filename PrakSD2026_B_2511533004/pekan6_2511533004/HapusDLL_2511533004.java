package pekan6_2511533004;

public class HapusDLL_2511533004 {

    // Fungsi menghapus node paling awal (kepala)
    public static NodeDLL_2511533004 delHead(NodeDLL_2511533004 head_3004) {
        // Jika daftar kosong
        if (head_3004 == null) {
            return null;
        }
        // Geser kepala ke node berikutnya
        head_3004 = head_3004.next_3004;
        // Jika masih ada node, putuskan tautan mundur ke node lama
        if (head_3004 != null) {
            head_3004.prev_3004 = null;
        }
        return head_3004;
    }

    // Fungsi menghapus node paling akhir (ekor)
    public static NodeDLL_2511533004 delLast(NodeDLL_2511533004 head_3004) {
        // Jika daftar kosong
        if (head_3004 == null) {
            return null;
        }
        // Jika hanya ada satu node
        if (head_3004.next_3004 == null) {
            return null;
        }
        // Telusuri sampai node paling akhir
        NodeDLL_2511533004 curr = head_3004;
        while (curr.next_3004 != null) {
            curr = curr.next_3004;
        }
        // Putuskan tautan dari node sebelum ekor
        curr.prev_3004.next_3004 = null;
        return head_3004;
    }

    // Fungsi menghapus node pada posisi tertentu
    public static NodeDLL_2511533004 delPos(NodeDLL_2511533004 head_3004, int pos_3004) {
        // Jika daftar kosong
        if (head_3004 == null) {
            return head_3004;
        }

        NodeDLL_2511533004 curr = head_3004;

        // Telusuri sampai mencapai posisi yang ingin dihapus
        for (int i = 1; curr != null && i < pos_3004; ++i) {
            curr = curr.next_3004;
        }

        // Jika posisi melebihi jumlah node / tidak ada
        if (curr == null) {
            System.out.println("Posisi tidak ditemukan!");
            return head_3004;
        }

        // Hubungkan node sebelum dan sesudah node yang dihapus
        if (curr.prev_3004 != null) {
            curr.prev_3004.next_3004 = curr.next_3004;
        }
        if (curr.next_3004 != null) {
            curr.next_3004.prev_3004 = curr.prev_3004;
        }

        // Jika node yang dihapus adalah node paling awal (head)
        if (head_3004 == curr) {
            head_3004 = curr.next_3004;
        }

        return head_3004;
    }

    // Fungsi mencetak seluruh isi DLL
    public static void printList(NodeDLL_2511533004 head_3004) {
        NodeDLL_2511533004 curr = head_3004;
        while (curr != null) {
            System.out.print(curr.data_3004 + " <-> ");
            curr = curr.next_3004;
        }
        System.out.println();
    }

    // Fungsi Utama
    public static void main(String[] args) {
        // Membuat DLL awal: 1 <-> 2 <-> 3 <-> 4 <-> 5
        NodeDLL_2511533004 head_3004 = new NodeDLL_2511533004(1);
        head_3004.next_3004 = new NodeDLL_2511533004(2);
        head_3004.next_3004.prev_3004 = head_3004;

        head_3004.next_3004.next_3004 = new NodeDLL_2511533004(3);
        head_3004.next_3004.next_3004.prev_3004 = head_3004.next_3004;

        head_3004.next_3004.next_3004.next_3004 = new NodeDLL_2511533004(4);
        head_3004.next_3004.next_3004.next_3004.prev_3004 = head_3004.next_3004.next_3004;

        head_3004.next_3004.next_3004.next_3004.next_3004 = new NodeDLL_2511533004(5);
        head_3004.next_3004.next_3004.next_3004.next_3004.prev_3004 = head_3004.next_3004.next_3004.next_3004;

        // Menjalankan operasi penghapusan
        System.out.print("DLL Awal: ");
        printList(head_3004);

        System.out.print("Setelah head dihapus: ");
        head_3004 = delHead(head_3004);
        printList(head_3004);

        System.out.print("Setelah node terakhir dihapus: ");
        head_3004 = delLast(head_3004);
        printList(head_3004);

        System.out.print("menghapus node ke 2: ");
        head_3004 = delPos(head_3004, 2);
        printList(head_3004);
    }
}