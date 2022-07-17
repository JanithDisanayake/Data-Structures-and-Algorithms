public class MainClass {
    public static void main(String[] ag)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(50);
        dll.insertFirst(40);
        dll.insertFirst(100);
        dll.insertFirst(8);
        dll.insertLast(1);
        dll.insertAfter(22, dll.head.next_node.next_node);
        //dll.deleteLast();
        //dll.deleteFirst();
        //dll.deleteAfter(dll.head);
        dll.print();
    }
}
