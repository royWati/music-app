package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {


    Context context;
    Music[] data;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, Music[] data) {
        this.context = context;
        this.data = data;

        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.single_item_list,null);
        TextView songName = convertView.findViewById(R.id.song_name);
        TextView artist = convertView.findViewById(R.id.artist_name);
        ImageView options = convertView.findViewById(R.id.options);

        songName.setText(data[position].getName());
        artist.setText(data[position].getArtist());
        return convertView;
    }
}
