public class DoublyLinkedList
{
    Node head = null;
    Node tail = null;

    public void insertFirst(int value)
    {
        if(head==null)
        {
            Node new_node = new Node();
            new_node.data = value;
            head=new_node;
            tail=new_node;
        }
        else
        {
            Node new_node = new Node();
            new_node.data = value;
            head.prev_node=new_node;    //Assign preious node of A
            new_node.next_node=head;    //Assign next node of B (newly added node)
            head=new_node;              //Asiign head to new node
        }
    }

    public void insertLast(int value)
    {
        Node new_node = new Node();
        new_node.data = value;
        tail.next_node = new_node;
        new_node.prev_node = tail;
        tail = new_node;
    }

    public void insertAfter(int value, Node current_node)
    {
        Node new_node = new Node();
        new_node.data = value;

        new_node.next_node = current_node.next_node;
        new_node.prev_node = current_node;

        current_node.next_node.prev_node = new_node;
        current_node.next_node = new_node;
    }

    public void deleteFirst()
    {
        head = head.next_node;
        System.out.println(head.data);
        head.prev_node = null;
    }

    public void deleteLast()
    {
        tail = tail.prev_node;
        tail.next_node = null;
    }

    public void deleteAfter(Node current_node)
    {
        //current_node.prev_node.prev_node.next_node = current_node;
        //current_node.prev_node = current_node.prev_node.prev_node;
        current_node.next_node.next_node.prev_node = current_node;
        current_node.next_node = current_node.next_node.next_node;
    }

    public void print()
    {
        Node current_node = head;
        while(current_node.next_node!=null)
        {
            System.out.println("Data is " + current_node.data);
            current_node=current_node.next_node;
        }
        System.out.println("Data is " + current_node.data);
    }
}
