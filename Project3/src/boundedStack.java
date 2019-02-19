
class boundedStack<E> {
    int counter = 0;
    // pointer to first node in stack
    private Node<E> top;

    // constructor
    public boundedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(E data) {
        // Counter increments everytime push() is called
        counter++;
        if (data == null)
            return;

        // build a node and place it on the stack
        Node<E> newNode = new Node<E>(data);

        // handle first time
        // assign the top and bottom to new node
        if (counter == 1) {
            top = newNode;
            return;
        }

        // else do the rest below

        // after new node is made, newnode.next is pointing to the original "top"
        newNode.next = top;
        // top.previous is pointing to the newest node
        if (top != null) {
            top.previous = newNode;
        }
        // no longer original "top". top is now pointing to new node
        top = newNode;

        // after 51 nodes are made, call the overflow method

        // Calling overflow for stack to make sure there is only the max number of
        // elements in the stack

        overflow();

    }

    public E pop() {
        Node<E> temp;

        temp = top;
        if (isEmpty())
            return null;

        top = top.next;
        return temp.getData();
    }

    public String toString() {
        Node<E> p;

        String showAll = "";
        // Display all the nodes in the stack
        for (p = top; p != null; p = p.next)
            showAll += p.toString() + "\n";
        return showAll;
    }

    private void overflow() {
        Node<E> lastNode = null;
        Node<E> beforeLastNode = null;

        if (counter > 50) {
            // start from top
            lastNode = top;
            // iterate thru the stack
            while (lastNode.next != null) {
                // one before last node
                beforeLastNode = lastNode;
                // last node
                lastNode = lastNode.next;
            }
            // this is the last node in the stack
            // Set last node to null 
            beforeLastNode.next = null;
            lastNode = null;
            // decrement counter
            counter--;
            // Set the top node to temp node
            // if the next node is null then set the current node to null
            // decrement counter
        }
    }
}
