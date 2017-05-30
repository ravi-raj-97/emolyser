package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuesEleven extends AppCompatActivity {
    public static int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_eleven);

        TextView tv1 = (TextView)findViewById(R.id.textView13);
        Button bt1 = (Button)findViewById(R.id.button23);
        Button bt2 = (Button)findViewById(R.id.button24);

        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton39);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton40);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton41);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=5;
            }});
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=4;
            }});
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=6;
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent it1 = new Intent(QuesEleven.this, PicPage.class);
                                       startActivity(it1);
                                   }
                               });
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it2 = new Intent(QuesEleven.this, QuesTwelve.class);
                        startActivity(it2);
                    }
                });
    }
}
