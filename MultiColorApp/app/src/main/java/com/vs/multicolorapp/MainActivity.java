package com.vs.multicolorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    }

    private void XMLChangeColor(View v)
    {
        Button myButton = (Button)findViewById(v.getId());
        myButton.setTextColor(0xff0000);
    }
    private void ChangeColor(int id)
    {
        Button myButton = (Button)findViewById(id);
        TextView hello_btn = (TextView)findViewById(R.id.hello_tv);
        OnClickListener myListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                int color;
                switch(v.getId())
                {
                    case R.id.black_btn:
                        color = 0x070707;
                        break;
                    case R.id.green_btn:
                        color = 0x15BC0F;
                        break;
                    case R.id.blue_btn:
                        color = 0x0F7ABC;
                        break;
                    case R.id.red_btn:
                        color = 0xBC0F21;
                        break;
                    default:
                        color = 0xBC0F21;
                        break;
                }
                hello_btn.setTextColor(Color.parseColor(color));
            }
        };
        myButton.setOnClickListener(myListener);
    }
}