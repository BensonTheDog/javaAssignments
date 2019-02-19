// This is with Generics
//Class Stack ---------------------------------------
class Stack<E>
{
    // pointer to first node in stack
    private Node<E> top;

    // constructor
    public Stack()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void push(E data)
    {
        if (data == null)
            return;
        // build a node and place it on the stack
        Node<E> newNode = new Node<E>(data);
        newNode.next = top;
        top = newNode;
    }

    public E pop()
    {
        Node<E> temp;

        temp = top;
        if (isEmpty())
            return null;

        top = top.next;
        return temp.getData();
    }

    // console display
    public String toString()
    {
        Node p;

        String showAll = "";
        // Display all the nodes in the stack
        for( p = top; p != null; p = p.next )
            showAll += p.toString() + "\n";
        return showAll;
    }
}
// This is without Generics
//// Class Stack ---------------------------------------
//public class Stack {
//    // pointer to first node in stack
//    private StackNode top;
//
//    // constructor
//    // for when the stack is made, the first thing is null
//    public Stack() {
//        top = null;
//    }
//
//    public void push(StackNode newNode) {
//        // if the newNode is not equal to anything return
//        if (newNode == null)
//            return;   // emergency return
//        //New nodes is at the top of the list
//        newNode.next = top;
//        // top variable is now the newNode you just made
//        top = newNode;
//    }
//
//    public StackNode pop() {
//        StackNode temp;
//
//
//        temp = top;
//        if (top != null) {
//            // make the top node equal to the one behind it
//            top = top.next;
//            // make the temp node null
//            temp.next = null; // don't give client access to stack!
//        }
//        return temp;
//    }
//
//    // console display
//    public void showStack() {
//        StackNode p;
//
//        // Display all the nodes in the stack
//        for (p = top; p != null; p = p.next)
//            p.show();
//    }
//}
//