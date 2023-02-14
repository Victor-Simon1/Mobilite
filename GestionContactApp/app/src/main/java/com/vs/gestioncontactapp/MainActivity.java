package com.vs.gestioncontactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Contact name[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = new Contact[20];//{"Will Smith","Eric Antoine","Brad Pitt","Mimie Maty","Omar Sy"};
        name[0] = new Contact("Smith","Will","10/12/87",R.drawable.smiley);
        name[1] = new Contact("Antoine","Eric","102220",R.drawable.smiley);
        name[2] = new Contact("Pitt","Brad","102220",R.drawable.smiley);
        name[3] = new Contact("Maty","Mimie","102220",R.drawable.smiley);
        name[4] = new Contact("Sy","Omar","102220",R.drawable.smiley);
        name[5] = new Contact("Starr","Joey","102220",R.drawable.smiley);
        name[6] = new Contact("Johnson","Dwayne","102220",R.drawable.smiley);
        name[7] = new Contact("Batista","Dave","102220",R.drawable.smiley);
        name[8] = new Contact("Dujardin","Jean","102220",R.drawable.smiley);
        name[9] = new Contact("Monroe","Marilin","102220",R.drawable.smiley);
        name[10] = new Contact("Downey Jr","Robert","102220",R.drawable.smiley);
        name[11] = new Contact("Pratt","Chris","102220",R.drawable.smiley);
        name[12] = new Contact("Johansson","Scarlett","102220",R.drawable.smiley);
        name[13] = new Contact("Olsen","Elizabeth","102220",R.drawable.smiley);
        name[14] = new Contact("Ford","Harrison","102220",R.drawable.smiley);
        name[15] = new Contact("Garfield","Andrew","102220",R.drawable.smiley);
        name[16] = new Contact("Isaac","Oscar","102220",R.drawable.smiley);
        name[17] = new Contact("Hardy","Tom","102220",R.drawable.smiley);
        name[18] = new Contact("Hemsworth","Chris","102220",R.drawable.smiley);
        name[19] = new Contact("Ruffalo","Mark","102220",R.drawable.smiley);
        ListView l = findViewById(R.id.list);
        ContactAdapter arr = new ContactAdapter(this, R.layout.item_view, name);
        //Afin de pouvoir lié la listview à l'adapter
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = parent.getAdapter().getItem(position);//parent.getItemAtPosition(position);

                TextView firstname = (TextView)view.findViewById(R.id.firstname);
                TextView name = (TextView)view.findViewById(R.id.name);
                TextView birthdate = (TextView)view.findViewById(R.id.birthDate);
                MainActivity.this.name[(int)id].setClicked(true);
                //name[(int)id].changeColor(Color.RED);
                firstname.setTextColor(Color.RED);
                name.setTextColor(Color.RED);
                birthdate.setTextColor(Color.RED);
                Toast toast = Toast.makeText(getApplicationContext(), "click sur " + ((Contact)o).PrintToast(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}