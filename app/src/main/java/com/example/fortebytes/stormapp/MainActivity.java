package com.example.fortebytes.stormapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        ArrayList<Post> your_array_list = new ArrayList<Post>();

        //Populating list
        Post posty = new Post("foo", "bar","foobar");
        your_array_list.add(posty);
        Post posty2 = new Post("bar", "foo","barfoo");
        your_array_list.add(posty2);
        Post posty3 = new Post("foo", "bar","foobar");
        your_array_list.add(posty3);
        Post posty4 = new Post("bar", "foo","barfoo");
        your_array_list.add(posty4);
        Post posty5 = new Post("foo", "bar","foobar");
        your_array_list.add(posty5);
        Post posty6 = new Post("bar", "foo","barfoo");
        your_array_list.add(posty6);
        Post posty7 = new Post("foo", "bar","foobar");
        your_array_list.add(posty7);
        Post posty8 = new Post("bar", "foo","barfoo");
        your_array_list.add(posty8);

        // Create the adapter to convert the array to views
        PostsAdapters adapter = new PostsAdapters(this, your_array_list);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lv_homepage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                //String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), position + "", Toast.LENGTH_SHORT).show();

            }
        });

    }

}
