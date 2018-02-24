package com.projectz.aapg.aapgbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int number = getIntent().getExtras().getInt("imgnum");
            String string = getIntent().getExtras().getString("string2");

            ArrayList<content> fb = new ArrayList<content>();
            fb.add(new content(string, number));
            contentAdapter FacebookAdapter = new contentAdapter(this, fb);

            // Get a reference to the ListView, and attach the adapter to the listView.
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(FacebookAdapter);
        }
        Button newButton = (Button)findViewById(R.id.newPostButton);
        newButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Intent newPostIntent = new Intent(MainActivity.this,CreatePost.class);
                startActivity(newPostIntent);
            }



        });
    }
    /** @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // list must be auto filled
        ArrayList<content> postContent = new ArrayList<>();
        postContent.add(new content());

        ArrayAdapter<content> itemsAdapter =
                new ArrayAdapter<content>(this ,     ,    );
        ListView listView = (ListView) findViewById();
        listView.setAdapter(itemsAdapter);

    }**/
}
