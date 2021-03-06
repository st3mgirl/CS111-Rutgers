/**
 * This class represents one blackjack player (or the dealer)
 */
public class Player {
   // define fields here

   /**
    * This constructor creates a player.
    * @param playerName Player name
    * @param isDealer If isDealer is true, this Player object represents the dealer.
    */
   public Player(String playerName, boolean isDealer) {
      // complete this method
   }

   /**
    * This method retrieves the player's name.
    * @return Player's name
    */
   public String getName() {
      return null; // replace this line with your code
   }

   /**
    * This method retrieves the player's hand of cards.
    * @return APlayer's hand of cards
    */
   public Hand getHand() {
      return null; // replace this line with your code
   }

   /**
    * This method deals two cards to the player (one face down if this is the dealer).
    *
    * @param deck Deck of cards.
    * @param window Should be used to redraw the window whenever a card is dealt.
    */
   public void startRound(Deck deck, BlackjackWindow window) {
      // complete this method
   }

   /**
    * This method executes gameplay for one player.
    * <p>
    * If this player is the dealer: hits until score is at least 17.
    * <p>
    * If this is an ordinary player:
    * repeatedly asks the user if they want to hit (draw another card)
    * until either the player wants to stand (not take any more cards) or
    * his/her score exceeds 21 (busts).
    *
    * @param deck Deck of cards.
    * @param window Should be used to redraw the window whenever a card is dealt or turned over.
    */
   public void playRound(Deck deck, BlackjackWindow window) {
      // complete this method
   }

   /**
    * This method informs the player about whether they won, lost, or pushed.
    * It also discards the player's cards to prepare for the next round.
    * @param dealerScore Dealer's score
    * @param window Should be used to redraw the window after cards are discarded.
    */
   public void finishRound(int dealerScore, BlackjackWindow window) {
      // complete this method
   }
}
