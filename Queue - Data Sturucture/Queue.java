
class Queue
{
    private int[] data;
    private int tail,  head;

    public Queue()
    {
        data=new int[4];
        tail=0;
        head=0;
    }

    public void enqueue(int value)
    {   
        if(isFull()==true)
            System.out.println("Queue Is Full");
        else
            data[tail++] = value; //after inserting data tail increments by 1
    }

    public int dequeue()
    {
        return data[head++];
    }

    public boolean isFull()
    {
        if(data.length==tail && head==0)
            return true;
        else 
            return false;
    }

    public boolean isEmpty()
    {
        if(tail==0 || head==tail)
            return true;
        else
            return false;
    }

    public void print()
    {
        for(int counter=head; counter<tail; counter++)
        {   
            System.out.println("value is " + data[counter]);
        }
    }

    public void peek()
    {
        if(isEmpty()==true)
            {System.out.println("Queue is Empty!");}
        else
            {System.out.println(data[head]);}
    }
}
