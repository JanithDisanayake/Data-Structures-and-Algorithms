public class CircularSinglyLinkedList
{
    Node head=null;
    Node tail=null;

    public void insertFirst(int value)
    {
        if(head==null)
        {
            Node new_node = new Node();
            new_node.data=value;
            head=new_node;
            tail=new_node;
        }
        else
        {
            Node new_node = new Node();
            new_node.data=value;
            new_node.next_node=head;
            head=new_node;
            tail.next_node=new_node;
        }
        
    }

    public void insertLast(int value)
    {
        Node new_node = new Node();
        new_node.data = value;
        tail.next_node = new_node;
        tail=new_node;
        tail.next_node = head;
    }

    public void insertAfter(int value, Node current_node)
    {
        Node new_node = new Node();
        new_node.data=value;
        new_node.next_node=current_node.next_node;
        current_node.next_node=new_node;
    }

    public void print()
    {
        Node current_node = head;
        while(current_node!=tail)
        {
            System.out.println("Data is " + current_node.data);
            current_node=current_node.next_node;
        }
        System.out.println("Data is " + current_node.data);
    }


    public void deleteFirst()
    {
        head=head.next_node;
        tail.next_node=head;
    }

    public void deleteLast()
    {
        Node current_node=head;
        while(current_node.next_node!=tail)
        {
            current_node=current_node.next_node;
        }
        current_node.next_node=null;
        current_node.next_node=head;
        tail = current_node;
    }

    public void deleteAfter(Node current_node)
    {
        current_node.next_node=current_node.next_node.next_node;
    }
}



