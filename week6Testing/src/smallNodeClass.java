// WE use StackNode to build a larger stack

public class smallNodeClass {
    public static void main(String[] args) {
        float x;
        Stack<Float> fStk = new Stack<Float>();

        // build the stack
        for (x = 0; x < 5; x++)
            fStk.push(x);

        System.out.println("Entire stack without popping:");
        System.out.println(fStk);

        // System.out.println("\nNow pop and show:");
        // while (!fStk.isEmpty())
        //     System.out.println(fStk.pop());

        // System.out.println();
    }
}



