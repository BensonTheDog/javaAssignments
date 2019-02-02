public class GreetingCard {

    private String sender, recipient, message, occasion;

    public GreetingCard(String sender, String recipient, String message, String occasion) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.occasion = occasion;
    }

    public String toString() {
        String strCard =
                        "From:     [ " + sender +
                        " ]\nTo:       [ " + recipient +
                        " ]\nMessage:  [ " + message +
                        " ]\nOccasion: [ " + occasion + " ]";
        return strCard;
    }

    //accessors
    public String getSender() {
        return this.sender;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public String getMessage() {
        return this.recipient;
    }

    public String getOccasion() {
        return this.occasion;
    }

}
