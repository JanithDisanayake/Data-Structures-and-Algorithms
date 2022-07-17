
public class MainClass {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(70);
        q1.enqueue(20);
        q1.enqueue(15);
        q1.enqueue(25);
        q1.dequeue();
        //q1.dequeue();
        //q1.dequeue();
        //q1.dequeue();
        //q1.enqueue(15);
        q1.print();
        //q1.isFull();
        //q1.isEmpty();
        q1.peek();
    }
}

