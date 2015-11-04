package com.brandon.android.memorymatchgame;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
    private int mSize;
    private UUID mId;
    private String[] mValueOptions = new String[]{"Miranda", "Miranda", "Washington", "Washington", "Gabriel", "Gabriel", "Abraham", "Abraham", "Steve", "Steve", "Brandon", "Brandon", "Ashley", "Ashley", "Courtney", "Courtney", "Rachel", "Rachel", "Yolanda", "Yolanda"};
    private ArrayList<String> mValues;

    public Game(){
        mId = UUID.randomUUID();
    }//end Game()

    public int getSize(){
        return mSize;
    }//end getSize()

    public void setSize(int size){
        mSize = size;
        mValues.clear();

        for (int i = 0; i < mSize; i++){
            mValues.add(mValueOptions[i]);
        }
    }//end setSize(int)

    public UUID getId(){
        return mId;
    }//end getId()
}//end Game class