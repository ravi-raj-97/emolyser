package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesFifteen extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_fifteen);

        TextView tv1 = (TextView)findViewById(R.id.textView17);
        Button bt1 = (Button)findViewById(R.id.button31);
        Button bt2 = (Button)findViewById(R.id.button32);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton51);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton52);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton53);
        RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton54);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=10;
            }});
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=3;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=9;
            }});
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=4;
            }});

        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesFifteen.this, QuesFourteen.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent it2 = new Intent(QuesFifteen.this, Finish.class);
                                               startActivity(it2);
                                           }
                                       });
    }
}
