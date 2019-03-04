package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviews);

        ListViewAdapter adapter = new ListViewAdapter(getApplicationContext(),addData());
        listView.setAdapter(adapter);
    }

    public Music[] addData(){

        Music[] data = {
                new Music("Beautiful ","Bazzy"),
                new Music("Beautiful ","Fransica Batistelle"),
                new Music("Suckers ","Jonas"),
                new Music("Alright ","Kendrick Lamar"),
                new Music("Middle Child ","J Cole"),
                new Music("Bourne Sinner","J Cole")
        };

        return data;
    }

    public String[] options(){
        String [] data = {
                "Add to Favorites",
                "Add to Playlist",
                "Play next",
                "Set as ringtone",
                "Song info",
                "Hide",
                "Delete"
        };
        return data;
    }
}
