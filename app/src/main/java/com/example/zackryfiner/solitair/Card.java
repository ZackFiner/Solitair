package com.example.zackryfiner.solitair;

public class Card {
    private CardType type;
    private int number; // for the sake of simplicty, aces, jack, queen and King will just be numbers
    private Card child;
    public Card()
    {
        this.number = -1;
        this.type = CardType.UNASSIGNED;
        this.child = null;
    }
    public Card(int number, CardType type) {
        this(number, type, null);
    }
    public Card(int number, CardType type, Card child) {
        this.number = number;
        this.type = type;
        this.child = child;
    }
    public void setChild(Card child) {
        this.child = child;
    }
    public void setType(CardType type)
    {
        this.type = type;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    public int getNumber()
    {
        return this.number;
    }
    public CardType getType()
    {
        return this.type;
    }
    public Card getChild()
    {
        return this.child;
    }
}
