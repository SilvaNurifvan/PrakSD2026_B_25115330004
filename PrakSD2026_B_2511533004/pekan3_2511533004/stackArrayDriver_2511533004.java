package pekan3_2511533004;

public class stackArrayDriver_2511533004 {

	public static void main(String[] args) {
		stackArray_2511533004 s = new stackArray_2511533004();

        s.push_2511533004(10);
        s.push_2511533004(20);
        s.push_2511533004(30);

        System.out.println(s.pop_2511533004() + " dikeluarkan dari stack");
        System.out.println("Elemen teratas adalah :" + s.peek_2511533004());
        System.out.print("Element pada stack :");
        s.print_2511533004();
    }
}