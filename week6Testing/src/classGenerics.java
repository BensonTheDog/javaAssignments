import java.util.*;

class OrderedPair<A, B>
{
    private A first;
    private B second;
    public OrderedPair()
    {
    }

    public OrderedPair(final A a, final B b)
    {
        setBoth(a, b);
    }
    public void setFirst(final A a)
    {
        first = a;
    }
    public void setSecond(final B b)
    {
        second = b;
    }
    public void setBoth(final A a, final B b)
    {
        setFirst(a);
        setSecond(b);
    }
    public A getFirst()
    {
        return first;
    }
    public B getSecond()
    {
        return second;
    }
    public String toString()
    {
        return "(" + first + ", " + second + ") ";
    }
}

public class classGenerics {
    public static void main(String[] args) {
        OrderedPair<Integer, Integer> intPr;
        OrderedPair<String, Double> mixedPr;

        intPr = new OrderedPair<Integer, Integer>(3, -59);
        mixedPr = new OrderedPair<String, Double>("teach", 21.96);

        System.out.println("Individual pairs: " + intPr + mixedPr);

        // we can't create arrays of generics, but we can create collections
        ArrayList<OrderedPair<String, Double>> mixedPrArray
                = new ArrayList<OrderedPair<String, Double>>();

        // build the mixed pair array and show
        for (int k = 0; k < 10; k++) {
            mixedPrArray.add(
                    new OrderedPair<String, Double>("CIS " + k, k / 10.)
            );
        }
        System.out.println("Mixed Pair Array: ");
        for (int k = 0; k < 10; k++)
            System.out.println(mixedPrArray.get(k));
    }
}

