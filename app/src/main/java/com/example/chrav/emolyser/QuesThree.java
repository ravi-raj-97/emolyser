package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesThree extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_three);

        TextView tv1 = (TextView)findViewById(R.id.textView4);
        Button bt1 = (Button)findViewById(R.id.button5);
        Button bt2 = (Button)findViewById(R.id.button6);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton9);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton10);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton11);
        RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton12);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=10;
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=7;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=4;
            }});
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=1;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent it1 = new Intent(QuesThree.this, QuesTwo.class);
               startActivity(it1);
           }
       });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(QuesThree.this, QuesFour.class);
                startActivity(it2);
            }
        });
    }
}
