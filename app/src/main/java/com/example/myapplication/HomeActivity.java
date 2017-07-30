package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {

    ListView kekolist;
    String[] downs = { "Блонда", "Даун", "Инвалид"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // находим список
        kekolist = (ListView) findViewById(R.id.kekolist);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, downs);

        // присваиваем адаптер списку
        kekolist.setAdapter(adapter);
    }
}
