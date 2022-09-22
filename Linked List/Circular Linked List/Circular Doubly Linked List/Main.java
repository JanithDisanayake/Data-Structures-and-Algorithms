public class Main {
    public static void main(String[] args)
    {
        CircularDoublyLinkedList cll = new CircularDoublyLinkedList();
        cll.insertFirst(50);
        cll.insertFirst(40);
        cll.insertFirst(100);
        cll.insertFirst(8);
        cll.insertLast(1);
        cll.insertAfter(22, cll.head.next_node.next_node);
        //cll.deleteLast();
        //cll.deleteFirst();
        //cll.deleteAfter(cll.head);
        cll.print();
    }
}
