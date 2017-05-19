package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuesFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_five);

        TextView tv1 = (TextView)findViewById(R.id.textView6);
        Button bt1 = (Button)findViewById(R.id.button9);
        Button bt2 = (Button)findViewById(R.id.button10);
        bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent it1 = new Intent(QuesFive.this, QuesFour.class);
               startActivity(it1);
           }
       }
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(QuesFive.this, QuesSix.class);
                startActivity(it2);
            }
        }
    }
}
