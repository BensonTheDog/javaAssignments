// With generics
//Class Node  ----------------------------------
class Node<E>
{
    protected Node<E> next;
    private E data;

    // constructor
    public Node()
    {
        next = null;
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


//Without generics

//public class StackNode {
//    //Class StackNode  ----------------------------------
//    // data
//    public StackNode next;
//
//    // constructor
//    public StackNode() {
//        next = null;
//    }
//
//    // console display
//    public void show() {
//        System.out.print("(generic node) ");
//    }
//}
