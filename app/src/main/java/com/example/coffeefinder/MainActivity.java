package com.example.coffeefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] shops = {"The Drowsy Poet Coffee Company",
                            "Fosko Coffee Barre",
                            "Bodacious Brew",
                            "The Beachy Barista"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, shops));

        }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position) {
            case 0:
                startActivity(new Intent(MainActivity.this, DrowsyPoet.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Fosko.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, BodaciousBrew.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, BeachyBarista.class));
                break;
        }
    }
}
