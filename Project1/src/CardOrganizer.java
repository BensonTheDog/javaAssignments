public class CardOrganizer {

    //This is where the cards are going
    GreetingCard[] greetingCards = new GreetingCard[20];

    //Counter for the number of filled cards in the array
    int counter = 0;


    public boolean addCard(String sender, String recipient, String message, String occasion) {

        boolean returnBoolean = false;

        if (counter != 20) {

            GreetingCard newCard = new GreetingCard(sender, recipient, message, occasion);
            greetingCards[counter] = newCard;

            counter++;
            returnBoolean = true;

        }
        return returnBoolean;
    }


    public String findRecipient(String searchRecipient) {
        String returnString = "No recipient found";

        for (int i = 0; i < counter; i++) {
            if (greetingCards[i].getRecipient().compareTo(searchRecipient) == 0) {
                returnString = greetingCards[i].toString();

                //break statement to make sure that it only displays the first recipient that matches
                break;
            }


        }

        return returnString;
    }

    public void displayCards(String searchOccasion) {
        for (int i = 0; i < counter; i++) {
            if (greetingCards[i].getOccasion().compareTo(searchOccasion) == 0) {
                System.out.println(greetingCards[i].toString());
                System.out.println();
            }
        }

    }

    public String toString(){
        String returnString = "";

        for(int i = 0; i < counter; i++) {
            returnString = returnString +
                    "To: [" + greetingCards[i].getRecipient() + "]" +
                    " Occasion: [" + greetingCards[i].getOccasion() + "]\n";

        }
        return returnString;
    }

}
