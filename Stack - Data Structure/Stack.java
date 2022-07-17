
class Stack
{
    private int[] data;
    private int top;

    public Stack()
    {
        data = new int[5];
        top = 0;
    }

    public void push(int data)
    {
        if(isFull()==true)
            System.out.println("Stack is Full");
        else
            this.data[top++] = data;
        
    }

    public int pop()
    {
        return data[--top];
    }

    public void show()
    {
        for(int c=0; c<top; c++)
        {   System.out.println(data[c]);
        }
    }

    public boolean isFull()
    {
        if(top==data.length)
            return true;
        else
            return false;
    }

    public boolean isEmpty()
    {
        if(top==0)
            return true;
        else
            return false;
    }

    public void peek()
    {
        if(isEmpty()==true)
            System.out.println("Stack Is Empty");
        else
            System.out.println(data[top-1]);
    }
}
