package pekan4_2511533004;

public class QueueArrayDriver_2511533004 {
    public static void main(String[] args) {
        QueueArray_2511533004 queue = new QueueArray_2511533004(1000);

        queue.enqueue_3004(10);
        queue.enqueue_3004(20);
        queue.enqueue_3004(30);
        queue.enqueue_3004(40);

        System.out.println("Item di depan " + queue.front_3004());
        System.out.println("Item paling belakang " + queue.rear_3004());
        System.out.println("tampilan queue");
        queue.display();

        System.out.println();
        System.out.println(queue.dequeue_3004() + " dihapus dari queue");

        System.out.println("item di depan:" + queue.front_3004());
        System.out.println("item dibelakang: " + queue.rear_3004());
        System.out.println("tampilan queue setelah satu data dihapus");
        queue.display();
    }
}