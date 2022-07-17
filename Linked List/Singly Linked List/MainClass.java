public class MainClass {
    public static void main(String[] ag)
    {
        SinglyLinkedList LL1 = new SinglyLinkedList();
        LL1.insertFirst(50);
        LL1.insertLast(75);
        LL1.insertLast(65);
        LL1.insertLast(72);
        LL1.insertAfter(105, LL1.head.next_node);   //current_node = LL1.head.next_node.next_node
        // LL1.deleteFirst();
        // LL1.deleteLast();
        LL1.deleteAfter(LL1.head);  //delete the node after the head
        LL1.print();
    }
}