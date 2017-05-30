package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesSeven extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_seven);

        TextView tv1 = (TextView)findViewById(R.id.textView8);
        Button bt1 = (Button)findViewById(R.id.button13);
        Button bt2 = (Button)findViewById(R.id.button14);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton25);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton26);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton27);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=7;
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=8;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=10;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesSeven.this, QuesSix.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it2 = new Intent(QuesSeven.this, QuesEight.class);
                        startActivity(it2);
                    }
                });
    }
}
