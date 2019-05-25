package com.example.zackryfiner.solitair;


public class GameEngine {
    /**
     * This class will handle the moves:
     *  It is responsible for determine what moves are valid and what moves aren't
     *  It is responsible for calling the necessary mutators to update the game
     *  It is responsible for determining when the game is over.
     *
     *  RULES OF SOLITAIR:
     *  RULE-1: In order to assign a card a child (place another  card over it):
     *          1. The child must have the Opposite Color as the parent.
     *          2. The child must have a number n-1, where n is the number of the parent.
     *
     *  RULE-2: To move a card out of the card stack (the one that you can click to shuffle):
     *          1. You must move it either to the board, or onto your ace stack.
     *
     *  RULE-3: You cannot move cards from the board back into the card stack.
     *  RULE-4: You cannot move cards from the ace stack back into the card stack.
     *
     *  RULE-5: To move a card to the ace stack:
     *          1. The card must be of the same type as the ace stack.
     *          2. The card must number must have the number n+1, where n is the number of the top
     *             most card on the stack.
     *
     *  RULE-6: You can only move the topmost card of the ace stack back onto the board, and it must
     *  follow the same rules state in RULE-1
     */
    private SessionInfo currentSession;

}
