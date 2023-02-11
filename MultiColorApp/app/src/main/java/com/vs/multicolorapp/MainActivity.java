package com.vs.multicolorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.Map;
import java.util.HashMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private int mode; // value who check if we change background or textview
    private Map<Integer, Integer> mapColorId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mode = R.id.radioFont;

        mapColorId =  new HashMap<Integer, Integer>();
        mapColorId.put(R.id.black_btn, Color.BLACK);
        mapColorId.put(R.id.red_btn, Color.RED);
        mapColorId.put(R.id.blue_btn, Color.BLUE);
        mapColorId.put(R.id.green_btn, Color.GREEN);

        setContentView(R.layout.activity_main);
        ChangeColor(R.id.black_btn);
        ChangeColor(R.id.red_btn);
        ChangeColor(R.id.blue_btn);
       // ChangeColor(R.id.green_btn); mis en XML

        CheckButton(R.id.radioFont);
        CheckButton(R.id.radioBackground);
    }

    /**
     * Add Listener to check or uncheck radio Button
     * @param id
     */
    public void CheckButton(int id)
    {
        RadioButton  button = (RadioButton )findViewById(id);
        OnClickListener myListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton(v);
            }
        };

        button.setOnClickListener(myListener);
    }

    /**
     * Function who check or uncheck in a radioGroup
     * @param v
     */
    public void RadioButton(View v)
    {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.check(v.getId());
        mode = v.getId();
    }

    /**
     * Change The color of textview/background and if textview show a toast with the color changement
     * @param v
     */
    public void XMLChangeColor(View v)
    {
        TextView hello_btn = (TextView)findViewById(R.id.hello_tv);
        int color = mapColorId.get(v.getId());
        if(R.id.radioFont == mode)
        {
            Toast toast = Toast.makeText(v.getContext(), R.string.toast, Toast.LENGTH_LONG);
            toast.show();
            hello_btn.setTextColor(color);
        }
        else
        {
            ConstraintLayout currentLayout = (ConstraintLayout) findViewById(R.id.main_layout);
            currentLayout.setBackgroundColor(color);
        }
    }
    /**
     * Put listener for a button
     * @param id
     */
    public void ChangeColor(int id)
    {
        Button myButton = (Button)findViewById(id);
        OnClickListener myListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                XMLChangeColor(v);
            }
        };
        myButton.setOnClickListener(myListener);
    }
}