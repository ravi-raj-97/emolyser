package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesTen extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_ten);

        TextView tv1 = (TextView)findViewById(R.id.textView11);
        Button bt1 = (Button)findViewById(R.id.button19);
        Button bt2 = (Button)findViewById(R.id.button20);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton33);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton34);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton35);
        RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton36);
        RadioButton rb5 = (RadioButton)findViewById(R.id.radioButton37);
        RadioButton rb6 = (RadioButton)findViewById(R.id.radioButton38);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=4;
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=9;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=2;
            }});
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=9;
            }});
        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=7;
            }});
        rb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=1;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesTen.this, QuesNIne.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it2 = new Intent(QuesTen.this, PicPage.class);
                        startActivity(it2);
                    }
                });


    }
}
