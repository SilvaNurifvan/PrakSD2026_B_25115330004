package pekan4_2511533004;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511533004 {
    public static void main(String args[]) {
        Queue<String> q_3004 = new LinkedList<>();

        q_3004.add("Praktikum");
        q_3004.add("Struktur");
        q_3004.add("Data");
        q_3004.add("Dan");
        q_3004.add("Algoritma");

        Iterator<String> iterator = q_3004.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}