package com.example.zackryfiner.solitair;
import java.util.Stack;
/**
 * This class is responsible for containing all the information about a given session
 * including the configuration of the board, the time, and the moveCount
 */
public class SessionInfo {
    /**This class will contain information about a play session, such as where cards are located
     * ,moves made , and time spent.
    */
    private GameBoard board;
    private int moveCount;
    private long time;
    private Stack<Move> moves;
}
