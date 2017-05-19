package com.example.chrav.emolyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuesTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_two);

        TextView tv1 = (TextView)findViewById(R.id.textView3);
        Button bt1 = (Button)findViewById(R.id.button3);
        Button bt2 = (Button)findViewById(R.id.button4);
        bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent it1 = new Intent(QuesTwo.this, QuesOne.class);
               startActivity(it1);
           }
       }
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(QuesTwo.this, QuesThree.class);
                startActivity(it2);
            }
        }
    }
}
