package com.brandon.android.memorymatchgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TileListFragment extends ListFragment {
    private ArrayList<Game> mGames;

    public TileListFragment(){
        //required empty constructor
    }//end TileListFragment()

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mGames = GameShelf.get(getActivity()).getGames();
        GameAdapter adapter = new GameAdapter(mGames);
        setListAdapter(adapter);
    }//end onCreate(Bundle)

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        //Get the Game from the adapter
        Game g = ((GameAdapter)getListAdapter()).getItem(position);
        Intent i = new Intent(getActivity(), GameActivity.class);
        i.putExtra(Game.EXTRA_SIZE, g.getSize());
        startActivity(i);
    }//end onListItemClick

    @Override
    public void onResume(){
        super.onResume();
        ((GameAdapter)getListAdapter()).notifyDataSetChanged();
        Toast.makeText(getActivity(), "Choose the size of your game board.", Toast.LENGTH_LONG);
    }//end onResume()

    private class GameAdapter extends ArrayAdapter<Game> {
        public GameAdapter(ArrayList<Game> games){
            super(getActivity(), 0, games);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            //If we weren't given a view, inflate one
            if (convertView == null){
                convertView = getActivity().getLayoutInflater().inflate(R.layout.game_size_list, null);
            }

            //Configure the view for this game
            Game g = getItem(position);
            TextView tileTextView = (TextView)convertView.findViewById(R.id.number_of_tiles_listItem);
            tileTextView.setText(g.getSize() + " Tiles");

            return convertView;
        }//end getView(int, View, ViewGroup)
    }//end GameAdapter class
}//end TileListFragment class