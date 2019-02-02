// Main is used to gain input from user or display output to user

public class Main {
    public static void main(String[] args) {

        CardOrganizer organizer = new CardOrganizer();


        //This method adds one card to the array with the supplied data

        if (organizer.addCard("sender1", "recipient1", "message1", "occasion1"))
            System.out.println("Greeting Card 1 added successfully ");
        else
            System.out.println("Failed to add");
System.out.println("...Adding more cards...");
        organizer.addCard("sender2", "recipient2", "message2", "occasion2");
        organizer.addCard("sender3", "recipient3", "message3", "occasion3");
        organizer.addCard("sender4", "recipient4", "message4", "occasion4");
        organizer.addCard("sender5", "recipient5", "message5", "occasion5");
        organizer.addCard("sender6", "recipient6", "message6", "occasion6");
        organizer.addCard("sender7", "recipient7", "message7", "occasion7");
        organizer.addCard("sender8", "recipient8", "message8", "occasion8");
        organizer.addCard("sender9", "recipient9", "message9", "occasion9");
        organizer.addCard("sender10", "recipient10", "message10", "occasion10");
        organizer.addCard("sender11", "recipient11", "message11", "occasion11");
        organizer.addCard("sender12", "recipient12", "message12", "occasion12");
        organizer.addCard("sender13", "recipient13", "message13", "occasion13");
        organizer.addCard("sender14", "recipient14", "message14", "occasion14");
        organizer.addCard("sender15", "recipient15", "message15", "occasion15");
        organizer.addCard("sender16", "recipient16", "message16", "occasion16");
        organizer.addCard("sender17", "recipient17", "message17", "occasion17");
        organizer.addCard("sender18", "recipient18", "message18", "occasion18");
        organizer.addCard("sender19", "recipient19", "message19", "occasion19");
        organizer.addCard("sender20", "recipient20", "message20", "occasion2");

        //more than 20 cards were added for testing of the other methods
        if (organizer.addCard("sender21", "recipient21", "message21", "occasion21"))
            System.out.println("Added successfully");
        else
            System.out.println("Greeting Card 21 failed to add\n");

        //This is the method used to return the first occurrence of the recipient in the array
        System.out.println("Finding recipient with given value == [recipient3]...");
        System.out.println(organizer.findRecipient("recipient3") +"\n");

        //This is the method used to display all the greetingCards that match the parameter value
        System.out.println("Displaying all greeting cards with given value == [occasion2]...");
        organizer.displayCards("occasion2");
        System.out.println();

        //This is the method to return a string that holds the entire cardOrganizer array only including recipient and occasion
        System.out.println("Displaying all only the Recipient and the Occasion for all Greeting Cards...");
        System.out.println(organizer.toString());
    }
}
