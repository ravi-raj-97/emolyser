package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesTwelve extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_twelve);

        TextView tv1 = (TextView)findViewById(R.id.textView14);
        Button bt1 = (Button)findViewById(R.id.button25);
        Button bt2 = (Button)findViewById(R.id.button26);

        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton42);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton43);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton44);
        RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton45);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=7;
            }});
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=2;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=8;
            }});
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=1;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesTwelve.this, QuesEleven.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent it2 = new Intent(QuesTwelve.this, QuesThirteen.class);
                                               startActivity(it2);
                                           }
                                       });
    }
}
