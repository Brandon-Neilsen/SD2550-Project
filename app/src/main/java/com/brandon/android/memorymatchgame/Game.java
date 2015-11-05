package com.brandon.android.memorymatchgame;

public class Game {
    private int mSize;
    public static final String EXTRA_SIZE = "com.brandon.android.memorymatchgame.game.size";

    public Game(){
    }//end Game()

    public int getSize(){
        return mSize;
    }//end getSize()

    public void setSize(int size){
        mSize = size;
    }//end setSize(int)
}//end Game class