package com.example.zackryfiner.solitair;

public interface Move {
    public boolean isValid();
    public void performMove();
    public void undo();
}
