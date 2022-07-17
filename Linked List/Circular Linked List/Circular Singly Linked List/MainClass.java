public class MainClass {
    public static void main(String[] ag)
    {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();

        cll.insertFirst(100);
        cll.insertFirst(90);
        cll.insertFirst(80);
        cll.insertFirst(70);
        cll.insertLast(110);
        cll.insertAfter(75, cll.head);
        cll.deleteFirst();
        cll.deleteLast();
        cll.deleteAfter(cll.head.next_node);
        cll.print();

    }
}
