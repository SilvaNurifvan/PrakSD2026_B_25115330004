package pekan3_2511533004;

import java.util.ArrayList;

public class Siswastack_2511533004 {
    String nama;
    int nim;

    public Siswastack_2511533004(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String toString() {
        return "Nim: " + nim + ", Nama: " + nama;
    }
}

	class SiswaStack {
    private ArrayList<Siswastack_2511533004> stack;

    public SiswaStack() {
        stack = new ArrayList<>();
    }

    public void push(Siswastack_2511533004 mhs) {
        stack.add(mhs);
    }

    public Siswastack_2511533004 pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public Siswastack_2511533004 peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void tampilkanSiswa() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {

        SiswaStack studentStack = new SiswaStack();

        Siswastack_2511533004 mhs1 = new Siswastack_2511533004("Ali", 1);
        Siswastack_2511533004 mhs2 = new Siswastack_2511533004("Boby", 2);
        Siswastack_2511533004 mhs3 = new Siswastack_2511533004("Charles", 3);

        studentStack.push(mhs1);
        studentStack.push(mhs2);
        studentStack.push(mhs3);

        System.out.println("Daftar Siswa di Stack:");
        studentStack.tampilkanSiswa();

        System.out.println("\nData yang di-pop: " + studentStack.pop());

        System.out.println("Data paling atas sekarang: " + studentStack.peek());
    }
}