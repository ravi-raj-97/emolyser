package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesNIne extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_nine);

        TextView tv1 = (TextView)findViewById(R.id.textView10);
        Button bt1 = (Button)findViewById(R.id.button17);
        Button bt2 = (Button)findViewById(R.id.button18);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton31);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton32);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=3;
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=4;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesNIne.this, QuesEight.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it2 = new Intent(QuesNIne.this, QuesTen.class);
                        startActivity(it2);
                    }
                });
    }
}
