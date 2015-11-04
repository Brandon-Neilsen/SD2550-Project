package com.brandon.android.memorymatchgame;

import android.content.Context;
import java.util.ArrayList;
import java.util.UUID;

public class GameShelf {
    private ArrayList<Game> mGames;
    private static GameShelf sGameShelf;
    private Context mAppContext;

    private GameShelf(Context appContext) {
        mAppContext = appContext;
        mGames = new ArrayList<Game>();

        for (int i = 4; i <= 20; i = i + 2) {
            Game g = new Game();
            g.setSize(i);
            mGames.add(g);
        }
    }//end GameShelf(Context)

    public static GameShelf get(Context c) {
        if (sGameShelf == null) {
            sGameShelf = new GameShelf(c.getApplicationContext());
        }

        return sGameShelf;
    }//end get(Context)

    public ArrayList<Game> getGames(){
        return mGames;
    }//end getGames()

    public Game getGame(UUID id){
        for (Game g: mGames){
            if (g.getId().equals(id)){
                return g;
            }
        }
        return null;
    }//end getGame(UUID)
}//end GameShelf class