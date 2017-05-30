package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesSix extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_six);

        TextView tv1 = (TextView)findViewById(R.id.textView7);
        Button bt1 = (Button)findViewById(R.id.button11);
        Button bt2 = (Button)findViewById(R.id.button12);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton21);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton22);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton23);
        RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton24);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=4;
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=5;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=3;
            }});
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=10;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesSix.this, QuesFive.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it2 = new Intent(QuesSix.this, QuesSeven.class);
                        startActivity(it2);
                    }
                });
    }
}
