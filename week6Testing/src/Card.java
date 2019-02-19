// ======  Card.java  ==================================

//Card class --------------------------------------------------------------------
public class Card implements Comparable<Card>
{
    // type and constants
    public enum Suit { clubs, diamonds, hearts, spades }

    // for ordering
    public static char[] valueRanks = { '2', '3', '4', '5', '6', '7', '8', '9',
            'T', 'J', 'Q', 'K', 'A'};
    static Suit[] suitRanks = {Suit.clubs, Suit.diamonds, Suit.hearts,
            Suit.spades};
    static int numValsInOrderingArray = 13;

    // private data
    private char value;
    private Suit suit;
    boolean errorFlag;

    // 4 overloaded constructors
    public Card(char value, Suit suit)
    {
        set(value, suit);
    }

    public Card(char value)
    {
        this(value, Suit.spades);
    }
    public Card()
    {
        this('A', Suit.spades);
    }
    // copy constructor
    public Card(Card card)
    {
        this(card.value, card.suit);
    }

    // mutators
    public boolean set(char value, Suit suit)
    {
        char upVal;            // for upcasing char

        // convert to uppercase to simplify
        upVal = Character.toUpperCase(value);

        if ( !isValid(upVal, suit))
        {
            errorFlag = true;
            return false;
        }

        // else implied
        errorFlag = false;
        this.value = upVal;
        this.suit = suit;
        return true;
    }

    // accessors
    public char getVal()
    {
        return value;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public boolean getErrorFlag()
    {
        return errorFlag;
    }

    public boolean equals(Card card)
    {
        if (this.value != card.value)
            return false;
        if (this.suit != card.suit)
            return false;
        if (this.errorFlag != card.errorFlag)
            return false;
        return true;
    }

    // stringizer
    public String toString()
    {
        String retVal;

        if (errorFlag)
            return "** illegal **";

        // else implied

        retVal =  String.valueOf(value);
        retVal += " of ";
        retVal += String.valueOf(suit);

        return retVal;
    }

    // helper
    private boolean isValid(char value, Suit suit)
    {
        char upVal;

        // convert to uppercase to simplify (need #include <cctype>)
        upVal = Character.toUpperCase(value);

        // check for validity
        if (
                upVal == 'A' || upVal == 'K'
                        || upVal == 'Q' || upVal == 'J'
                        || upVal == 'T'
                        || (upVal >= '2' && upVal <= '9')
        )
            return true;
        else
            return false;
    }

    // sort member methods
    public int compareTo(Card otherCard)
    {
        if (this.value == otherCard.value)
            return ( getSuitRank(this.suit) - getSuitRank(otherCard.suit) );

        return (
                getValueRank(this.value)
                        - getValueRank(otherCard.value)
        );
    }

    // helpers for compareTo()
    public static int getSuitRank(Suit st)
    {
        int k;

        for (k = 0; k < 4; k++)
            if (suitRanks[k] == st)
                return k;

        // should not happen
        return 0;
    }

    public  static int getValueRank(char val)
    {
        int k;

        for (k = 0; k < numValsInOrderingArray; k++)
            if (valueRanks[k] == val)
                return k;

        // should not happen
        return 0;
    }
}