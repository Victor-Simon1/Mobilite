package com.vs.multicolorapp;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {


    private int mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mode = R.id.radioFont;
        setContentView(R.layout.activity_main);

        Button myButton = (Button)findViewById(R.id.black_btn);
        OnClickListener myListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "text", Toast.LENGTH_LONG);
                toast.show();
            }
        };
        myButton.setOnClickListener(myListener);

        ChangeColor(R.id.black_btn);
        ChangeColor(R.id.red_btn);
        ChangeColor(R.id.blue_btn);
       // ChangeColor(R.id.green_btn);

        RadioButton  fontButton = (RadioButton )findViewById(R.id.radioFont);
        RadioButton  backgroundButton = (RadioButton )findViewById(R.id.radioBackground);
        OnClickListener myListener2 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton(v);
            }
        };
        fontButton.setOnClickListener(myListener2);
        backgroundButton.setOnClickListener(myListener2);
    }

    public void RadioButton(View v)
    {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.check(v.getId());
        mode = v.getId();
    }
    public void XMLChangeColor(View v)
    {
        TextView hello_btn = (TextView)findViewById(R.id.hello_tv);
        int color;
        if(R.id.radioFont == mode)
        {
            switch(v.getId()) {
                case R.id.black_btn:
                    color = Color.BLACK;
                    break;
                case R.id.green_btn:
                    color = Color.GREEN;
                    break;
                case R.id.blue_btn:
                    color = Color.BLUE;
                    break;
                case R.id.red_btn:
                    color = Color.RED;
                    break;
                default:
                    color = Color.WHITE;
                    break;
            }
            Log.w("Color","Button");
            hello_btn.setTextColor(color);
        }
        else
        {
            ConstraintLayout currentLayout = (ConstraintLayout) findViewById(R.id.main_layout);
            switch(v.getId())
            {
                case R.id.black_btn:
                    color = Color.BLACK;
                    break;
                case R.id.green_btn:
                    color = Color.GREEN;
                    break;
                case R.id.blue_btn:
                    color = Color.BLUE;
                    break;
                case R.id.red_btn:
                    color = Color.RED;
                    break;
                default:
                    color = Color.WHITE;
                    break;
            }
            currentLayout.setBackgroundColor(color);
            //  currentLayout.setBackgroundTintList();
            Log.w("Color","Backgrond");
        }
    }
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