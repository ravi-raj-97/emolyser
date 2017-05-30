package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesEight extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_eight);

        TextView tv1 = (TextView)findViewById(R.id.textView9);
        Button bt1 = (Button)findViewById(R.id.button15);
        Button bt2 = (Button)findViewById(R.id.button16);

        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton28);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton29);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton30);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=1;
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=2;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=7;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesEight.this, QuesSeven.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it2 = new Intent(QuesEight.this, QuesNIne.class);
                        startActivity(it2);
                    }
                });
    }
}
