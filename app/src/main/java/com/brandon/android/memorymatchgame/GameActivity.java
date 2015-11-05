package com.brandon.android.memorymatchgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    private String[] mValueOptions = new String[]{"Miranda", "Miranda", "Washington", "Washington", "Gabriel", "Gabriel", "Abraham", "Abraham", "Steve", "Steve", "Brandon", "Brandon", "Ashley", "Ashley", "Courtney", "Courtney", "Rachel", "Rachel", "Yolanda", "Yolanda"};
    private ArrayList<String> mValues;
    private int mSize = getIntent().getIntExtra(Game.EXTRA_SIZE, 4);

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        for (int i = 0; i < mSize; i++){
            mValues.add(mValueOptions[i]);
            Collections.shuffle(mValues);
        }
        setContentView(R.layout.activity_game);
    }
}//end GameActivity class
