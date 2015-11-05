package com.brandon.android.memorymatchgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    private String[] mValueOptions = new String[]{"Miranda", "Washington", "Gabriel", "Abraham", "Steve", "Brandon", "Ashley", "Courtney", "Rachel", "Yolanda"};
    private int mSize;
    private ArrayList<Button> mButtons = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mSize = getIntent().getIntExtra(Game.EXTRA_SIZE, 4);

        ViewGroup row1 = (ViewGroup)findViewById(R.id.row_one);
        ViewGroup row2 = (ViewGroup)findViewById(R.id.row_two);
        ViewGroup row3 = (ViewGroup)findViewById(R.id.row_three);
        ViewGroup row4 = (ViewGroup)findViewById(R.id.row_four);
        ViewGroup row5 = (ViewGroup)findViewById(R.id.row_five);
        ViewGroup row6 = (ViewGroup)findViewById(R.id.row_six);
        ViewGroup row7 = (ViewGroup)findViewById(R.id.row_seven);

        for (int i = 0; i <= mSize/2; i++){
            Button a = new Button(this);
            Button b = new Button(this);
            a.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            b.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            a.setText(mValueOptions[i]);
            b.setText(mValueOptions[i]);
            mButtons.add(a);
            mButtons.add(b);
        }
        Collections.shuffle(mButtons);

        for(int i = 0; i <= mSize; i++){
            if (i < 3){
                row1.addView(mButtons.get(i));
            }
            else if (i >=3 && i < 6){
                row2.addView(mButtons.get(i));
            }
            else if (i >= 6 && i < 9){
                row3.addView(mButtons.get(i));
            }
            else if (i >= 9 && i < 12){
                row4.addView(mButtons.get(i));
            }
            else if (i >= 12 && i < 15){
                row5.addView(mButtons.get(i));
            }
            else if (i >= 15 && i < 18){
                row6.addView(mButtons.get(i));
            }
            else if (i >=18 && i < 21){
                row7.addView(mButtons.get(i));
            }
        }
    }//end onCreate(Bundle)
}//end GameActivity class
