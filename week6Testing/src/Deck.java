// ======  Deck.java  ==================================
import java.util.*;

//class Deck  ----------------------------------------------------------------
public class Deck
{
    // six full decks (no jokers) is enough for about any game
    private static Card[] masterPack;  // one 52-Card master for initializing decks

    private ArrayList<Card> cards;
    private int numPacks;

    private static boolean firstTime = true;  // avoid calling allcMstrPck > once

    public Deck(int numPacks)
    {
        allocateMasterPack();  // do not call from init()
        cards = new ArrayList<Card>();
        init(numPacks);
    }

    static private void allocateMasterPack()
    {
        int j, k;
        Card.Suit st;
        char val;

        // we're in static method; only needed once per program: good for whole class
        if ( !firstTime )
            return;
        firstTime = false;

        // allocate
        masterPack = new Card[52];
        for (k = 0; k < 52; k++)
            masterPack[k] = new Card();

        // next set data
        for (k = 0; k < 4; k++)
        {
            // set the suit for this loop pass
            st = Card.Suit.values()[k];

            // now set all the values for this suit
            masterPack[13 * k].set('A', st);
            for (val= '2', j = 1; val <= '9'; val++, j++)
                masterPack[13 * k + j].set(val, st);
            masterPack[13 * k + 9].set('T', st);
            masterPack[13 * k + 10].set('J', st);
            masterPack[13 * k + 11].set('Q', st);
            masterPack[13 * k + 12].set('K', st);
        }
    }

    public Deck()
    {
        this(1);
    }

    // set deck from 1 to 6 packs, perfecly ordered
    public void init(int numPacks)
    {
        int k, pack;

        if (numPacks < 1 || numPacks > 6)
            numPacks = 1;

        cards.clear();
        // hand over the masterPack cards to our deck
        for (pack = 0; pack < numPacks; pack++)
            for (k = 0; k < 52; k++)
                cards.add(0, masterPack[k]);

        // if something modified a card, we would be in trouble.  fortunately,
        // we don't expect a card to ever be modified after instantiated
        // in the context of a deck. e.g. state would be for deck set-up only

        this.numPacks = numPacks;
    }

    public void init()
    {
        init(1);
    }

    public int getNumCards()
    {
        return cards.size();
    }

    public void shuffle()
    {
        Card tempCard;
        int k, randInt, topCard;

        // topCard avoids calling size() every loop pass
        topCard = cards.size();
        for (k = 0; k < topCard; k++)
        {
            randInt = (int)(Math.random() * topCard);

            // swap cards k and randInt (sometimes k == randInt:  okay)
            tempCard = cards.get(k);
            cards.set( k, cards.get(randInt) );
            cards.set( randInt, tempCard );
        }
    }

    public Card dealCard()
    {
        // always deal the top card (which we will take from position 0)
        Card errorReturn = new Card('E', Card.Suit.spades); //  in rare cases

        if (cards.size() == 0)
            return errorReturn;
        else
            return cards.remove(0);
    }

    public Card inspectCard(int k)
    {
        // return copy of card at position k.
        // if client tries to access out-of-bounds card, return error

        Card errorReturn = new Card('E', Card.Suit.spades); //  in rare cases

        if ( k < 0 || k >= cards.size() )
            return errorReturn;
        else
            return cards.get(k);
    }
}