public class touristList {
    class IntNode {
        public String touristName;
        public int passportNumber;
        public String destinationCity;
        public IntNode next;

        private IntNode(String a, int b, String c, IntNode n) {
            touristName = a;
            passportNumber = b;
            destinationCity = c;
            next = n;
        }
    }

    private int listSize;
    private IntNode first;

    public touristList(String a, int b, String c) {
        first = new IntNode(a, b, c, null);
        listSize++;
    }

    public void addFirst(String a, int b, String c) {
        first = new IntNode(a, b, c, first);
        listSize++;
    }

    public String size() {
        return "The list has " + listSize + " tourist(s).";
    }


    public String findNode(String a) {

        IntNode p = first;

        while (p != null) {

            if (a == p.touristName) {
                return a + " is in the list.";
            }
            p = p.next;
        }
        return "There is nobody in the list by that name.";
    }

}
