public class airport {
    public static void main(String[] args){
        touristList clueless = new touristList("Waldo", 12345, "Prague");
        clueless.addFirst("Clifford", 54321, "Home");
        clueless.addFirst("Daffy", 11111, "DisneyLand");
        clueless.addFirst("President", 55555, "DC");

        System.out.println(clueless.size());
        System.out.println(clueless.findNode( "Waldo" ));
        System.out.println(clueless.findNode("Tester" ));

    }
}
