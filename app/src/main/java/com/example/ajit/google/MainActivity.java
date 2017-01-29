package com.example.ajit.google;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] ActivityArray = {"List View","Qrscanner","Facebook login","Google Login",
                "Github Login","Gmail","Game","Timer","Alert" , "Notification"};
        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.activity_listview, ActivityArray);
        ListView listView = (ListView) findViewById(R.id.Activitylist);
        listView.setAdapter(adapter);



    }
}
