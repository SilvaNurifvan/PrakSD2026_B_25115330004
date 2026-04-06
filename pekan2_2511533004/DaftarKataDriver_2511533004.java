package pekan2_2511533004;
public class DaftarKataDriver_2511533004 {

	public static void main(String[] args) {
		DaftarKata_2511533004 al = new DaftarKata_2511533004();
		
		// Menambah elemen (akhir)
		al.tambah_2511533004("Kami");
		al.tambah_2511533004("Informatika");
		
		// Menyisipkan elemen pada indeks 1
		al.tambahPada_2511533004(1, "Mahasiswa_2511533004 ");
		
		// Cetak isi awal
		System.out.println("Awal  : " + al);
		
		// Mengubah elemen (index 1)
		al.ubahElemen_2511533004(1, "Departemen");
		System.out.println ("Setelah Ubah : " + al);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511533004(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah Hapus: " + al);
		
		// Iterasi pada Arraylist (cetak setiap elemen)
		System.out.println("Iterasi:");
		al.iterasiCetak_2511533004();
		System.out.println();
	}
}
