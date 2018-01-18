package com.example.fortebytes.stormapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import android.view.GestureDetector;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    GestureDetector detector;

    public static final String EXTRA_MESSAGE = "com.example.fortebytes.stormapp.Main2Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Instanciating an array list (you don't need to do this,
        // you already have yours).
        final ArrayList<Post> your_array_list = new ArrayList<Post>();

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




        final Button button = findViewById(R.id.btn_add_post);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                String add_title = "Button Title Add";
                String add_content = "Button Content Add";

                Post button_post = new Post(add_title,add_content,"washu");
                your_array_list.add(button_post);
                Toast.makeText(getBaseContext(), "Hello Button", Toast.LENGTH_SHORT).show();
            }
        });


        listView.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeLeft() {
                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }

        });
    }

    /** Called when the user taps the Send button */
    public void securityActivityIntent(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        TextView editText = (TextView) findViewById(R.id.tv_act2);
        startActivity(intent);
    }
}
