class Node<E>
{
    // next is referencing the 
    protected Node<E> next;
    protected Node<E> previous;

    private E data;

    // constructor
    public Node()
    {
        next = null;
        previous = null;

    }
    public Node(E data)
    {
        setData(data);
    }

    public boolean setData(E data)
    {
        if (data == null)
            return false;
        this.data = data;
        return true;
    }

    public E getData()
    {
        return data;
    }

    // console display
   public String toString()
   {
       return data.toString();
   }
}
