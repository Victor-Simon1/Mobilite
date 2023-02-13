package com.vs.gestioncontactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Contact name[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = new Contact[11];//{"Will Smith","Eric Antoine","Brad Pitt","Mimie Maty","Omar Sy"};
        name[0] = new Contact("Smith","Will","102220",1);
        name[1] = new Contact("Antoine","Eric","102220",1);
        name[2] = new Contact("Pitt","Brad","102220",1);
        name[3] = new Contact("Maty","Mimie","102220",1);
        name[4] = new Contact("Sy","Omar","102220",1);
        name[5] = new Contact("Starr","Joey","102220",1);
        name[6] = new Contact("Johnson","Dwayne","102220",1);
        name[7] = new Contact("Batista","Dave","102220",1);
        name[8] = new Contact("Dujardin","Jean","102220",1);
        name[9] = new Contact("Dujardin","Jean","102220",1);
        name[10] = new Contact("Dujardin","Jean","102220",1);
        ListView l = findViewById(R.id.list);
        ContactAdapter arr = new ContactAdapter(this, R.layout.item_view, name);
        //Afin de pouvoir lié la listview à l'adapter
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Object o = l.getItemAtPosition(position);
                TextView tv = (TextView)arg1.findViewById(R.id.firstname);
                tv.setTextColor(Color.RED);
                Toast toast = Toast.makeText(getApplicationContext(), "click sur " + o, Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}