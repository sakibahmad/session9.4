package com.example.aanammalik.context94;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting content
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        registerForContextMenu(btn);
    }
    @Override
    //providing item to menu
    public void onCreateContextMenu(ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0, v.getId(), 0, "Add");
        menu.add(0, v.getId(), 0, "Edit");
        menu.add(0, v.getId(), 0, "Delete");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //providing toast to every item
        if (item.getTitle() == "Add") {
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Edit") {
            Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Delete") {
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        } else {
            return false;
        }
        return true;
    }

}