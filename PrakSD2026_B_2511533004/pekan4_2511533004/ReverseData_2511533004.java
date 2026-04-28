package pekan4_2511533004;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533004 {
    public static void main(String[] args) {
        Queue<Integer> q_3004 = new LinkedList<Integer>();

        q_3004.add(1);
        q_3004.add(2);
        q_3004.add(3); // [1, 2, 3]

        System.out.println("sebelum reverse" + q_3004);

        Stack<Integer> s = new Stack<Integer>();

        while (!q_3004.isEmpty()) { // Q -> S
            s.push(q_3004.remove());
        }

        while (!s.isEmpty()) { // S -> Q
            q_3004.add(s.pop());
        }

        System.out.println("sesudah reverse= " + q_3004); // [3, 2, 1]
    }
}