package pekan4_2511533004;

public class QueueArray_2511533004{
    int front_3004, rear_3004, size_3004;
    int capacity;
    int array[];

    public QueueArray_2511533004(int capacity) {
        this.capacity = capacity;
        front_3004 = this.size_3004= 0;
        rear_3004= capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull_3004(QueueArray_2511533004 queue) {
        return (queue.size_3004 == queue.capacity);
    }

    boolean isEmpty_3004(QueueArray_2511533004 queue) {
        return (queue.size_3004 == 0);
    }

    void enqueue_3004(int item) {
        if (isFull_3004(this))
            return;
        this.rear_3004= (this.rear_3004 + 1) % this.capacity;
        this.array[this.rear_3004] = item;
        this.size_3004 = this.size_3004 + 1;
        System.out.println(item + " enqueued to queue");
    }
    int dequeue_3004() {
    if (isEmpty_3004(this))
        return Integer.MIN_VALUE;

    int item = this.array[this.front_3004];
    this.front_3004 = (this.front_3004 + 1) % this.capacity;
    this.size_3004 = this.size_3004 - 1;
    return item;
    }

    int front_3004() {
    if (isEmpty_3004(this))
        return Integer.MIN_VALUE;

    return this.array[this.front_3004];
    }

    int rear_3004() {
    if (isEmpty_3004(this))
        return Integer.MIN_VALUE;

    return this.array[this.rear_3004];
    }

    // mencetak elemen antrian
    void display() {
    int i;
    if (front_3004 == rear_3004) {
        System.out.printf("\nAntrian Kosong\n");
        return;
    }
    // kunjungi dari belakang dan cetak
    for (i = front_3004; i < rear_3004; i++) {
        System.out.printf(" %d <-- ", array[i]);
    }
    return;
}
}